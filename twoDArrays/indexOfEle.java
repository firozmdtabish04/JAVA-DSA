package twoDArrays;

public class indexOfEle {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 7, 8 };
        int target = 8;
        System.out.println("Target: " + target);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
            if (arr[i] == target) {
                System.out.println("\nElement "+arr[i]+" found at index "+i);
            }
        }
    }
}
