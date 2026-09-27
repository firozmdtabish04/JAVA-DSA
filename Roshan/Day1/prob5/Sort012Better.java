package Day1.prob5;

import java.util.Arrays;

public class Sort012Better {

    public static void sort(int[] arr) {
        int zero = 0;
        int one = 0;
        int two = 0;
        for (int num : arr) {
            if (num == 0)
                zero++;
            else if (num == 1)
                one++;
            else
                two++;
        }

        int index = 0;
        while (zero-- > 0)
            arr[index++] = 0;
        while (one-- > 0)
            arr[index++] = 1;
        while (two-- > 0)
            arr[index++] = 2;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 0, 2, 1, 1, 0 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
