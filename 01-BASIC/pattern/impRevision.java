public class impRevision {
    public static void main(String[] args) {
        int num = 5;
        int count = 0;
        // p1(num);
        // p2(num);
        // p3(num);
        // p4(num);
        // p5(num, count);
        p6(num);
    }

    // Pattern 1
    public static void p1(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(" # ");
            }
            System.out.println();
        }
    }

    // Pattern2
    public static void p2(int num) {
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" # ");
            }
            System.out.println();
        }
    }

    // Pattern 3
    public static void p3(int num) {
        for (int i = num - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" # ");
            }
            System.out.println();
        }
    }

    // Pattern 4
    public static void p4(int n) {
        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
    }

    // pattern 5
    public static void p5(int n, int count) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    // pattern 6
    public static void p6(int n) {
        for (int i = 0; i < n; i++) {
            int num = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }


}
