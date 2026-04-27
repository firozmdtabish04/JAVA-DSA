import java.util.Scanner;

public class revNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter number to rev: ");
        num = sc.nextInt();
        while (num > 0) {
            int lastDigit = num % 10;
            System.out.print(lastDigit + " ");
            num = num / 10;

        }
        System.out.println();
        sc.close();
    }
}
