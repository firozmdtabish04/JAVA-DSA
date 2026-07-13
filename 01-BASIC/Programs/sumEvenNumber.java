import java.util.Scanner;
public class sumEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;
        int odd = 0;
        System.out.print("Enter Number: ");
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
                System.out.print(i + ", ");
            } else {
                odd = odd + i;
            }
        }
        System.out.println("\nSum of even number: " + sum);
        System.out.println("Sum of odd number: " + odd);
        sc.close();
    }
}