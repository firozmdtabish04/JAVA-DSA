
public class reverseArrayPointer {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        reverseArray(arr);

    }

    public static void reverseArray(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int val : arr) {
            System.out.print(val+" ");
        }
    }
}