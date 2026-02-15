package Programs;

import java.util.Scanner;

public class prod2Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 1: ");
        int num1 = sc.nextInt();
        System.out.println("Input 2: ");
        int num2 = sc.nextInt();
        int res = num1 * num2;
        int add = num1 + num2;
        int sub = num1 - num2;
        int div = num1 / num2;
        int mod = num1 % num2;
        System.out.println("Product of 2 numbers are: " + res);
        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Division: " + div);
        System.out.println("Modulus: "+mod);
    }
}
