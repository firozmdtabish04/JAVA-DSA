public class InterleavingsString {

    public static void main(String[] args) {
        String str1 = "AB";
        String str2 = "CD";

        printInterleavings(str1, str2, "");
    }

    public static void printInterleavings(String s1, String s2, String result) {

        // If both strings are empty, print result
        if (s1.length() == 0 && s2.length() == 0) {
            System.out.println(result);
            return;
        }

        // Take first char from s1
        if (s1.length() > 0) {
            printInterleavings(
                    s1.substring(1),
                    s2,
                    result + s1.charAt(0));
        }

        // Take first char from s2
        if (s2.length() > 0) {
            printInterleavings(
                    s1,
                    s2.substring(1),
                    result + s2.charAt(0));
        }
    }
}