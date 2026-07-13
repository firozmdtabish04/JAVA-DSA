public class InneroddEven1 {
    public static void main(String[] args) {
        int[] a = { 2, 2, 6, 6, 8, 6, 10, 10, 10, 12, 12 };  
        int idx = 0;
        System.out.print("\nTotal even in given array : ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + ", ");
                idx++;
            }
        }
        System.out.println("\ntotal: " + idx);
    }
}