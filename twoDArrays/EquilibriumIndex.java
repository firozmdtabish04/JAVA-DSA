package twoDArrays;
public class EquilibriumIndex {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 2, 2 };
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum = totalSum - arr[i]; // right sum
            if (leftSum == totalSum) {
                System.out.println("Equilibrium Index: " + i);
            }
            leftSum += arr[i];
        }
    }
}