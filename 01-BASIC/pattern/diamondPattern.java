// 

// public class diamondPattern {
//     public static void main(String[] args) {
//         int n = 5;

//         // upper pyramid
//         for (int i = 1; i <= n; i++) {

//             for (int j = 1; j <= n - i; j++)
//                 System.out.print(" ");

//             for (int j = 1; j <= i; j++)
//                 System.out.print("* ");

//             System.out.println();
//         }

//         // lower pyramid
//         for (int i = n - 1; i >= 1; i--) {

//             for (int j = 1; j <= n - i; j++)
//                 System.out.print(" ");

//             for (int j = 1; j <= i; j++)
//                 System.out.print("* ");

//             System.out.println();
//         }
//     }
// }

public class diamondPattern {

    public static void main(String[] args) {
        int n = 5;
        // rows
        for (int i = 1; i <= n; i++) {

            // Space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // #
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        } 
        // Row boottom triangle
        for (int i = n - 1; i >= 1; i--) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}