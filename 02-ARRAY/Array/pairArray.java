public class pairArray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, };
        pairArr(arr);
    }

    public static void pairArr(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int j = i + 1; j < arr.length; j++) { 
                System.out.print("(" + curr + ", " + arr[j] + ") ");
                total++;
            }
            System.out.println();

        }
        System.out.println("Total pairs: " + total);
    }
}

// n(n-1)/2 = total pairs
