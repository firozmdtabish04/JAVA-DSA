
public class RemoveDuplicates {
    public static void main(String[] args) {

        int arr[] = { 10, 10, 30, 40 };
        Duplicate(arr);
        dup(arr);
    }

    public static void Duplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        return;
    }

    public static void dup(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }

        }
        return;
    }
}

// Using HashSet

// import java.util.HashSet;
// import java.util.LinkedHashSet;

// public class RemoveDuplicates {

// public static void main(String[] args) {
// int arr[] = { 10, 20, 30, 10, 40, 10, 50 };
// // HashSet<Integer> set = new HashSet<>();
// LinkedHashSet<Integer> set = new LinkedHashSet<>();
// for (int res : arr) {
// set.add(res);
// }
// System.out.println(set);
// }
// }