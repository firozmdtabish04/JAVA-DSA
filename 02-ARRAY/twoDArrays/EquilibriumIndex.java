
public class EquilibriumIndex {
    public static void main(String[] args) {
        int arr[] = { 8, 3, 2, 2, 5, 2, 9, 2, 2 };
        EquilibriumIdx(arr);

    }

    public static void EquilibriumIdx(int arr[]) {
        int totalSum = 0;
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            totalSum = totalSum - arr[i]; // right sum
            if (leftSum == totalSum) {
                System.out.println("Equilibrium Index: " + i);
            }
            leftSum += arr[i];
        }

    }
}