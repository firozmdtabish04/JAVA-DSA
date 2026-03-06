

public class largesrInArray {
    public static void main(String[] args) {
        // int a[] = new int[] { 12, 44,100, 23, 56, 9, 23, 78, 13,99 };
        int a[] = new int[] {};
        if (a.length == 0) {
            System.out.println("Out of bound");
            return;
        }
        int max = a[0];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
                index = i;
            }
        }
        System.out.println("Maximum: " + max + " Index: " + index);
    }
}
