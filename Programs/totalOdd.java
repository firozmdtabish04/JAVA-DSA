package Programs;
import java.util.Scanner;

public class totalOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int num;
        System.out.println("**********\n");
        System.out.print("Enter number (length): ");
        num = sc.nextInt();
        System.out.println("Odd numbers are : ");
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                count++;
                System.out.print(i + ",");

            }
        }
        System.out.println("\nTotal number off odd are : " + count);
        System.out.println("\n**********");
        sc.close();

    }
}
