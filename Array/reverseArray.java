package Array;

public class reverseArray {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 10, 30, 20, 40, 50 };
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]+", ");
        }
    }
}
