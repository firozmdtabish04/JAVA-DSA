package hardArray;

public class KadaneAlgo {
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,6,7,8,9,10 };
        int maxSum = arr[0];
        int currentSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println("Maximum Subarray Sum = " + maxSum);
    }
}