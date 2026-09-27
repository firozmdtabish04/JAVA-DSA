package CollectionFramework.LIST;

import java.util.ArrayList;
import java.util.Arrays;

public class SortAL {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        // int arr [] = {2,4,1,5,9,3,4};
        // ArrayList al = new ArrayList<>();
        // Arrays.sort(arr);
        // System.out.print(Arrays.toString(arr)+" ");
        al.add("Tabish");
        al.add("Akhil");
        al.add("Abhilipsa");
        al.add("Mamunu");
        System.out.println(al+" ");
        al.remove("Akhil");
        System.out.println(al+" ");
    }
}
