package Array;

public class largestSmallest {
    public static int[] calculate(int a[]) {
        int max = a[0];
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        return new int[] { max, min };
    }

    public static void main(String[] args) {
        int a[] = new int[] { 23, 34, 13, 64, 72, 90, 10, 15, 9, 27, 100, 0, -4 };
        int result[] = calculate(a);

        System.out.println("Maximum Value: " + result[0]);
        System.out.println("Minimum Value: " + result[1]);
    }
}
