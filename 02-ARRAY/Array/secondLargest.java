

import java.util.Arrays;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 20, 8, 15,14 };
        Arrays.sort(arr);
        System.out.println("Second largest element: "+arr[arr.length-3]);
    }
}
