package hardArray;

import java.util.Arrays;

public class kthLargestEle {

    public static int findKthLargest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[arr.length - k];
    }
    public static void main(String[] args) {
        int[] arr = { 7, 10, 4, 3, 20, 15 };
        int k = 2;
        int result = findKthLargest(arr, k);
        System.out.println("Kth largest element is: " + result);
    }
}
