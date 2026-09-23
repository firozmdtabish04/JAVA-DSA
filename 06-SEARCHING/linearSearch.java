
public class linearSearch {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 5, 6, 8, 9, 1 };
        System.out.println("Original Array: ");
        for (int num : arr) {
            System.out.print(num + ", ");
        }

        int key = 8;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("\nKey found " + arr[i] + " at idx " + i);

            }
        }

    }
}
