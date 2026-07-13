public class pyramid {

    static void pyramidPattern(int n) {

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

    public static void main(String[] args) {
        pyramidPattern(5);
    }
}