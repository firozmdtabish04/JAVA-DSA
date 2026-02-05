import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String args[]) {
        int n, arg, sum = 0, r;
        Scanner sc = new Scanner(System.in);

        System.out.println("**********\n");
        System.out.print("Enter Number: ");
        n = sc.nextInt();

        arg = n;
        for (int i = 1; i < n; i++) {
            while (n > 0) {
                r = n % 10;
                sum = sum + (r * r * r);
                n = n / 10;

            }

        }
        if (arg == sum) {
            System.out.println("Given number is armstrong number: " + arg);
        } else {
            System.out.println("Given number is not armstrong number: " + arg);
        }
        System.out.println("\n**********");
        sc.close();
    }

}