package twoDArrays;

// import java.util.Arrays;

public class majorityEle {

    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 3, 3, 2, 2 ,3,2,3,2};
        int candidate = arr[0];
        int count = 1;
        System.out.println("Length of array: " + arr.length);
        System.out.println("Array elements arr: ");
        // Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }
        }
        System.out.println("\nMajority Element: " + candidate);
    }
} 