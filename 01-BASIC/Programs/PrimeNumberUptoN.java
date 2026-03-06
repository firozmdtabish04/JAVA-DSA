
import java.util.Scanner;

public class PrimeNumberUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*********\n");
        System.out.print("Enter Number: ");
        int number = sc.nextInt();
        int num = 0, i = 0;
        System.out.println("Prime numbers are :");
        for (i = 1; i <= number; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                System.out.print(i + " ");
            }
            sc.close();
        }
        System.out.print("\n\n*********");
    }
}
