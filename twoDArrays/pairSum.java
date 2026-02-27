package twoDArrays;

//  Method -01 O

// public class pairSum {
//     public static void main(String[] args) {
//         int[] arr = new int[] { 7, 10, 4, 3, 20, 15, 0, 221 };
//         int target = 221;

//         pairSum obj = new pairSum();
//         obj.pairSumFun(arr, target);

//     }

//     public void pairSumFun(int[] arr, int target) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (i == j)
//                     continue;
//                 if (arr[i] + arr[j] == target) {

//                     System.out.println("Target: "+ target);
//                     System.out.println("Index are: " + i + ", " + j);
//                     System.out.println("pairs: " + arr[i] + ", " + arr[j]);
//                     return;
//                 }

//             }

//         }
//         System.out.println("Not found any pair!");
//     }
// }

// Method -02 O(n)
import java.util.HashMap;

public class pairSum {

    public static void main(String[] args) {

        int[] arr = { 7, 10, 4, 3, 20, 15, 0, 221 };
        int target = 221;

        pairSum obj = new pairSum();
        obj.pairSumFun(arr, target);

    }

    public void pairSumFun(int[] arr, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int complement = target - arr[i];

            if (map.containsKey(complement)) {

                System.out.println("Index are: " + map.get(complement) + ", " + i);
                System.out.println("Values are: " + complement + ", " + arr[i]);
                return;
            }

            map.put(arr[i], i);
        }

        System.out.println("No pair found");
    }
}