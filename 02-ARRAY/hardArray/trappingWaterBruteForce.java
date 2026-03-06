

// O(n²)
public class trappingWaterBruteForce {
    public static void main(String[] args) {
        int arr[] = { 3, 0, 2, 0, 4 };
        int n = arr.length;
        int water = 0;
        for (int i = 0; i < n; i++) {
            int leftMax = arr[i];
            int rightMax = arr[i];

            // Max on left
            for (int j = 0; j <= i; j++) {
                leftMax = Math.max(leftMax, arr[j]);
            }

            // Max on right
            for (int j = i; j < n; j++) {
                rightMax = Math.max(rightMax, arr[j]);
            }

            water += Math.min(leftMax, rightMax) - arr[i];
        }
        System.out.println("Total Water Trapped = " + water);
    }
}
