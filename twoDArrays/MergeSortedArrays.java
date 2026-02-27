// Good for unsorted array but worst for sorted array...
// O((n1 + n2) log (n1 + n2))

// Merge + Sort O((n1+n2) log(n1+n2))

// Time Complexity:O(n1+n2)
// Space Complexity:O(n1+n2)

package twoDArrays;

// import java.util.Arrays;

// public class mergeArray {
// public static void main(String[] args) {

// int[] arr1 = { 1, 12, 3 };
// int[] arr2 = { 4, 5, 6 };

// int[] merged = new int[arr1.length + arr2.length];

// for (int i = 0; i < arr1.length; i++) {
// merged[i] = arr1[i];
// }

// for (int i = 0; i < arr2.length; i++) {
// merged[arr1.length + i] = arr2[i];
// }
// Arrays.sort(merged);

// for (int num : merged) {
// System.out.print(num + " ");
// }
// }
// }

// Merge 2 arrays using system.arrayCopy()
// import java.util.Arrays;
// public class MergeArrays {
//     public static void main(String[] args) {

//         int[] arr1 = { 5, 2, 8 };
//         int[] arr2 = { 1, 9, 3 };

//         int[] merged = new int[arr1.length + arr2.length];

//         System.arraycopy(arr1, 0, merged, 0, arr1.length);
//         System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);

//         Arrays.sort(merged);

//         System.out.println(Arrays.toString(merged));
//     }
// }

public class MergeSortedArrays {
    public static void main(String[] args) {

        int[] arr1 = { 1, 3, 5 };
        int[] arr2 = { 2, 4, 6 };

        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] merged = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                merged[k] = arr1[i];
                i++;
            } else {
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            merged[k++] = arr1[i++];
        }
        while (j < n2) {
            merged[k++] = arr2[j++];
        }
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}