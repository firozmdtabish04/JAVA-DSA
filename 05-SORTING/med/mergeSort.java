
public class mergeSort {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 5, 6, 8, 9, 1 };
        System.out.println("Original Array: ");
        for (int num : arr) {
            System.out.print(num + ", ");
        }

   

    }
    public static void main(int arr[], int si, int mid, int ei) {
             // Function for MergeSor
        int merged[] = new int[ei- si+1];
        int idx1 =si;
        int idx2 = mid+1;
        int x =0;

        while (idx1<=mid && idx2<=ei) {
            if(arr[idx1]<= arr[idx2]){
                merged[x++]=  arr[idx1++];
            }
            else{
                merged[x++] = arr[idx2++];
            }
        }
    }
}
