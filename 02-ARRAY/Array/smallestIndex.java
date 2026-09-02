
public class smallestIndex {
    public static void main(String[] args) {
        int a[] = new int[] { 12, 44, 23, 56, 9, 23, 78, 13, 0, -9};
        minIndVal(a);

    }

    public static void minIndVal(int arr[]) {
        int minIndex =0;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minIndex =i;
            }
        }
        System.out.println("Min Value: "+min);
        System.out.println("Minimum value Index: "+minIndex);
    }
}