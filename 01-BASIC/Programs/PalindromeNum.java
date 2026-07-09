import java.util.Scanner;
public class PalindromeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("**********");
        System.out.print("Insert number: ");
        n = sc.nextInt();

        int palindromeNum, r, rev = 0;
        palindromeNum = n;

        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }  
        
        if (rev == palindromeNum) {
            System.out.println("The given num is palindrome: " + rev);
        } else {
            System.out.println("The given num is not palindrome: " + rev);
        }
        System.out.println("\n**********");
        sc.close();
    }
} 