import java.util.Scanner;

public class inputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        char ch;

        System.out.println("String Input: ");
        str = sc.nextLine();
        System.out.println("Char Input: ");
        ch = sc.next().charAt(0);
        System.out.println("String Output: "+str);
        System.out.println("Char Output: " + ch);
        sc.close();
    }
}
