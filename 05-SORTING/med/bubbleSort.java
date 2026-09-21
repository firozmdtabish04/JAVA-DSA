
public class bubbleSort {

    public static void BubbleSort(int arr[]) {
        // Bubble sort funct
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 4, 8, 5, 9, 6, 199, -1 };
        System.out.print("\nUnSorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Print sorted array
        BubbleSort(arr);

        System.out.print("\nSorted Array Using Bubble Sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
