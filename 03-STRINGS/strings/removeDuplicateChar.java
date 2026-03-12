
public class removeDuplicateChar {
    public static void main(String[] args) {
        String str = "Programming Language";
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (res.indexOf(ch) == -1) {
            res = res + ch;
            }
        }
        System.out.println("Original: "+ str);
        System.out.println("After removeing duplicate: "+ res);
    }
}
