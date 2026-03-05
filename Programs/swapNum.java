package Programs;

import java.util.Scanner;

public class swapNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Number 2: ");
        int num2 = sc.nextInt();

        System.out.println("Before Swapping: " + num1 + ", " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.print("After Swapping : " + num1 + ", " + num2);
        sc.close();
    }
}
