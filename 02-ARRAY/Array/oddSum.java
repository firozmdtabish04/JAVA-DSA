
import java.util.Scanner;

public class oddSum {
    public static void main(String[] args) {
        int arr[] = new int[] { 23, 34, 13, 64, 72, 90, 10, 12, 6, 27, 100, 0, -4 };
       
        OddSum(arr);
        
    }
    public static void OddSum(int [] arr ) {
        int sum =0;
        for(int i =0; i<arr.length; i++){
            if(arr[i]%2 !=0){
                System.out.print(arr[i] + " ");
                sum += arr[i]; 
            }
        }
        System.out.println("\nTotal Sum of odd: " + sum);
    }
}
