
public class lengthString {
    public static void main(String[] args) {
        String str = "Tab Tabish";
        int length = str.length();
        System.out.println(length);
        // int len = str.length();
        int len = str.lastIndexOf("Tabish");
        System.out.println(len);

    }
}
