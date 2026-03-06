
import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {

        System.out.println("**********\n");
        int num, rem = 0, sum = 0, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number (length): ");
        num = sc.nextInt();

        temp = num;
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println("Sum of Digits of " + temp + " is " + sum);
        System.out.println("\n**********");
        sc.close();
    }
}