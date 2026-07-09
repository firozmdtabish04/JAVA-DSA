import java.util.Scanner;
public class evenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("**********\n");
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } 
        else {
            System.out.println(num + " is not an even number.");
        }
        System.out.println("\n**********");
        sc.close();
    }
}