package Array;

public class findKey {
    public static void main(String[] args) {
        int a[] = new int[] { 12, 44, 23, 56, 9, 23, 78, 13 };
        int key = 560;
        int index = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] == key) {
                index=i;
                System.out.println("Key found : " + key +" Index: "+index);
            } else {
                System.out.println("Sorry no match...");
                return;
            }
        }
        

    }
}
