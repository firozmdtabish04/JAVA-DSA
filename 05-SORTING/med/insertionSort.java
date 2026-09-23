public class insertionSort {

    public static void InsertionSort(int arr[]) {
        // Function insertion Sort
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        int count[] = new int[max + 1];
        for (int num : arr) {
            count[num]++;
        }
        int idx = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                arr[idx++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 5, 6, 8, 9, 1 };
        System.out.println("Original Array: ");
        for (int num : arr) {
            System.out.print(num + ", ");
        }

        // Function Call
        InsertionSort(arr);
        System.out.println("\nSorted array (Using insertion Sort): ");
        for (int num : arr) {
            System.out.print(num + ", ");
        }

    }
}
