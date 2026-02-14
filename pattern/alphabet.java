package pattern;

public class alphabet {
    public static void main(String[] args) {
        int num = 12;
        char ch = 'A';

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= i; j++) {

                if (ch > 'z' || ch > 'Z') {
                    System.out.println("\n\nExit!\n");
                    return;
                }

                System.out.print(ch + " ");
                ch++;
            }

            System.out.println();
        }
    }
}
