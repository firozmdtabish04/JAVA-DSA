import java.util.Scanner;

public class sumNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;
        System.out.print("Enter Natural number: ");
        num = sc.nextInt();
        System.out.println("You Entered: " + num);
        for (int i = 1; i < num; i++) {
            sum = sum + num;

        }
        System.out.print("Sum of Natural Number is: " + sum);
        sc.close();
    }
}
