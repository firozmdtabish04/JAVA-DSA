package twoDArrays;

public class indexOfEle {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 0, 5, 7, 8 };
        int target = 1;
        System.out.println("Target: " + target);
        // indexOfEle obj = new indexOfEle();
        // obj.idxEle(arr, target);

        int res = idxEle(arr, target);
        if (res != -1) {
            System.out.println("Element found at " + res);
        }
        else {
            System.out.println("Element not found..");
        }
        

    }

    public static int idxEle(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                // System.out.println("Element " + arr[i] + " found at index " + i);
                return i;
    
            }
        }
        return -1;
    }
}
