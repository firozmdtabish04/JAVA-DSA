
import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 10, 30, 20, 40, 50 };
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("\n" + arr[arr.length - 2]);

    }
}
