import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        char operator;
        System.out.print("Enter value of a: ");
        a = sc.nextDouble();
        System.out.print("Enter value of b: ");
        b = sc.nextDouble();
        System.out.print("Enter operator [+,-,/,%,*] :- ");
        operator = sc.next().charAt(0);
        System.out.print("Output : ");
        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            case '*':
                System.out.println(a * b);
                break;

            default:
                System.out.println("Oops!, Sorry calculator is not advance.");
                break;
        }

    }
}