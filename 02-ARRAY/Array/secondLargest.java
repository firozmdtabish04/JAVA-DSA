import java.util.Arrays;
public class secondLargest {
    public static void main(String[] args) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int[] arr = { 10, 5, 20, 8, 15,14, 20 };
        
        // Arrays.sort(arr);
        // System.out.println("Second largest element: "+arr[arr.length-1]);
        
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        System.out.println(secondLargest);
    }
}