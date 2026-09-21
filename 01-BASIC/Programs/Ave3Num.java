import java.util.Scanner;

/**
 * Ave3Num
 */
public class Ave3Num {

    public static void main(String[] args) {
        Avg();
    }

    public static void Avg() {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Enter Value 1: ");
        num1 = sc.nextInt();
        System.out.print("Enter Value 2: ");
        num2 = sc.nextInt();
        System.out.print("Enter Value 3: ");
        num3 = sc.nextInt();

        double res = (num1 + num2 + num3) / 3.0;
        System.out.println("Average of 3 number is " + res);
        sc.close();
    }

}