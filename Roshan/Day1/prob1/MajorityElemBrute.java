package Day1.prob1;

/**
 * MajorityElem
 */
public class MajorityElemBrute {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 2, 1, 1, 2, 1, 1, 2 };
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > arr.length / 2) {
                System.out.println(arr[i]);
                return;
            }
        }
    }
}