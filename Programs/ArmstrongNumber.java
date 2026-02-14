package Programs;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String args[]) {

        int n, temp, sum = 0, r;
        Scanner sc = new Scanner(System.in);

        System.out.println("**********");
        System.out.print("Enter Number: ");
        n = sc.nextInt();

        temp = n; // store original number

        while (n > 0) {
            r = n % 10;
            // System.out.println(r);
            sum = sum + (r * r * r);
            // System.out.println(sum);
            n = n / 10;
            // System.out.println(n);
        }

        if (temp == sum) {
            System.out.println("Given number is Armstrong number: " + temp);
        } else {
            System.out.println("Given number is not Armstrong number: " + temp);
        }

        System.out.println("\n**********");
        sc.close();
    }
}
