package Programs;
import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("**********\n");
        System.out.print("Enter number (lenth): ");
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ,");
        }
        System.out.println("\n**********");
        sc.close();
    }
}
