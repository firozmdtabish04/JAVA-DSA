package Programs;
import java.util.Scanner;

// public class totalEven {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num;
//         System.out.println("**********\n");
//         System.out.print("Enter a number: ");
//         num = sc.nextInt();
//         for (int i = 1; i <= num; i++) {
//             if (i % 2 == 0) {
//                 System.out.print(i + " , ");
//             }
//         }

//         System.out.println("\n\n**********");
//         sc.close();
//     }
// }
// public class totalEven {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num;
//         System.out.println("**********\n");
//         System.out.print("Enter a number: ");
//         num = sc.nextInt();
//         for (int i = 2; i <= num; i += 2) {
//             System.out.print(i + ", ");

//         }

//         System.out.println("\n\n**********");
//         sc.close();
//     }
// }
public class totalEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("**********\n");
        int i = 1;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        while (i <= num) {
            if (i % 2 == 0) {
                System.out.print(i
                        + ",  ");
            }
            i++;
        }

        System.out.println("\n\n**********");
        sc.close();
    }
}
