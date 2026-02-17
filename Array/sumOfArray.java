package Array;

public class sumOfArray {
    public static void main(String[] args) {
        int[] a = { 2, 3, 6, 6,-17,9 };
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
            System.out.print(a[i] + ", ");
        }
        System.out.println("\nSum of array: "+sum);
    }
}
