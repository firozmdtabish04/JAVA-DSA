package twoDArrays;

public class maxProdSubArr {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int maxProd = arr[0];
        int minProd = arr[0];
        int result = arr[0];
        int result1 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int temp = Math.max(arr[i], Math.max(maxProd * arr[i], minProd * arr[i]));
            minProd = Math.min(arr[i], Math.min(maxProd * arr[i], minProd * arr[i]));
            maxProd = temp;
            result = Math.max(result, maxProd);
            result1 = Math.min(result1, minProd);
        }
        System.out.println("Maximum Product Subarray = " + result);
        System.out.println("Minimum Product Subarray = " + result1);
    }
}