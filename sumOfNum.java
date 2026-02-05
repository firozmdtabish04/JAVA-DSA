import java.util.Scanner;

public class sumOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;
        System.out.println("**********\n");
        System.out.print("Enter number (length): ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            sum = sum + i;
            System.out.print(i + ", ");
        }
        System.out.println("\nTotal Sum is: " + sum);

        System.out.println("\n**********");
        sc.close();
    }
}
