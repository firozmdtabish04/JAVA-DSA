package Day1.prob7;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 5, 7, 9, 3, 0 };
        System.out.println("Array Before Sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        bubbleSort(arr);
        System.out.println("\nArray after sorting: ");
        for(int num : arr){
            System.out.print(num+" ");
        }
        

    }
    public static void bubbleSort(int arr[]) {
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
}
