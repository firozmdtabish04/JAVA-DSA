package twoDArrays;

public class ifEleExist {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 0, 1, 2, 9 };
        int target = 41;
        if (arr.length == 0) {
            System.out.println("empty array!");
        }
        for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr.length);
            if (arr[i] == target) {
                System.out.println("Element: " + arr[i] + " found at index " + i);
                return;
            }

        }
        System.out.println("Element not found");
    }
}
