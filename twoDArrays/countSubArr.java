package twoDArrays;

// public class countSubArr {

//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 3, 4 };
//         int n = arr.length;
//         int total = n * (n + 1) / 2;
//         System.out.println(total);
//     }
// }

public class countSubArr {

    public static void printSubarrays(int[] arr, int k) {

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    // Print subarray from i to j
                    for (int x = i; x <= j; x++) {
                        System.out.print(arr[x] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 1 ,0,5};
        int k = 5;
        System.out.println("Subarrays with sum " + k + " are:");
        printSubarrays(arr, k);
    }
}