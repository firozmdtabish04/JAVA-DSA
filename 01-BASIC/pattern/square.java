import java.util.Scanner;

public class square {
    
    public static void square(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println(); // use to move cursor in next line
        }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the size of the square: ");
        int n = sc.nextInt();
        square(n);
        sc.close();

    }
}
