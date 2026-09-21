
public class selectionSort {
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 4, 7, 0, 9 };
        // function for print original array
        System.out.println("\nArray before Sorting: ");
        for (int num : arr) {
            System.out.print(num + ", ");
        }
        // Function CAll
        selectionSort(arr);
        // Array after Sorting
        System.out.println("\nSorted Array (Selection Sort): ");
        for (int num : arr) {
            System.out.print(num + ", ");
        }
    }
}