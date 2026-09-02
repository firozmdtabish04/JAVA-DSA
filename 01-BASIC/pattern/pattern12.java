public class pattern12 {
    public static void main(String[] args) {
        int n = 5;
        int space = 2 * (n - 1);

        for (int i = 1; i <= n; i++) {

            // Left numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Spaces
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // Right numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
            space -= 2; // Reduce spaces for next row
        }
    }
}