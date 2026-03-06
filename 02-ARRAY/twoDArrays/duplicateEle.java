
public class duplicateEle {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 4, 5, 1, 2, 3, 4 };
        boolean[] visited = new boolean[arr.length];
        System.out.println("Total elements in array: " + arr.length);
        for (int num : arr) {
            System.out.print(num + ", ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {

            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if (count > 1) {
                System.out.println("Duplicate element: " + arr[i]);
            }

        }

    }
}
