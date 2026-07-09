import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int temp = n;
        int original = n;
        int digits = 0;
        int sum = 0;

        // Count digits
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        temp = n;

        // Calculate Armstrong sum
        while (temp != 0) {
            int r = temp % 10;
            sum += (int) Math.pow(r, digits);
            temp /= 10;
        }

        if (sum == original)
            System.out.println(original + " is an Armstrong Number");
        else
            System.out.println(original + " is Not an Armstrong Number");

        sc.close();
    }
}