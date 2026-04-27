import java.util.Scanner;

public class addSentence {
    public static void main(String[] args) {
        addSent(null);
    }

    public static void addSent(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Add Sentences: ");
        str = sc.nextLine();
        System.out.println("You entered: " + str);
        System.out.println(str.toUpperCase());
        sc.close();

    }
}
