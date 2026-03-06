

// public class stringReversed {
//     public static void main(String[] args) {
//         String str = "TABISH";
//         char ch[] = str.toCharArray();
//         int start = 0;
//         int end = ch.length - 1;
//         while (start < end) {
//             char temp = ch[start];
//             ch[start] = ch[end];
//             ch[end] = temp;

//             start++;
//             end--;

//         }
//             String reversed = new String(ch);
//             System.out.println("Reversed array: "+reversed);


//     }
// }

// Using String Builder..
public class stringReversed {    public static void main(String[] args) {
        String str = "Abhilipsa";
        StringBuilder rev = new StringBuilder(str);
        System.out.println(rev.reverse());

    }

}