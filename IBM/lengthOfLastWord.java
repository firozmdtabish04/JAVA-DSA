

public class lengthOfLastWord {

    public static void main(String[] args) {

        String str = " hii  i am Tabish ";
        int count = 0;
        System.out.println("String characters:");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        // lastWordLength(str, count);
        lastWordLengthTrim(str, count);
    }

    // Without trim()
    public static void lastWordLength(String str, int count) {
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                if (count > 0) {
                    break;
                }
            } else {
                count++;
            }
        }
        System.out.println("\nSize of Last word is: " + count);
    }

    // Using trim()
    public static void lastWordLengthTrim(String str, int count) {
        str = str.trim(); // Important
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                break;
            }
            count++;
        }
        System.out.println("\nSize of Last word using trim(): " + count);
    }
}