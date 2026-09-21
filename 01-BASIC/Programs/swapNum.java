import java.util.Scanner;

/**
 * swapNum
 */
public class swapNum {

    public static void main(String[] args) {
        SwapVar();
    }

    public static void SwapVar() {
        int val1, val2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value 1 : ");
        val1 = sc.nextInt();
        System.out.print("Enter Value 2 : ");
        val2 = sc.nextInt();
        System.out.println("Before Swap Variables " + val1 + " " + val2);
        int temp = val1;
        val1 = val2;
        val2 = temp;

        System.out.print("After Swap Two Variables " + val1 + " " + val2);
        sc.close();
    }
}