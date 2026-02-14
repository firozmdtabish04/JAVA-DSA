package Programs;
import java.util.Scanner;

public class electrictyBill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("**********\n");

        int units;
        int bill;

        System.out.println("[<=50], unit price: 3");
        System.out.println("[51 - 200], unit price: 6");
        System.out.println("[>200], unit price: 8\n");

        System.out.print("Units: ");
        units = sc.nextInt();

        if (units <= 50) {
            bill = units * 3;
            System.out.println("Per unit price: 3");

        } else if (units > 50 && units <= 200) {
            bill = units * 6;
            System.out.println("Per unit price: 6");

        } else {
            bill = units * 8;
            System.out.println("Per unit price: 8");
        }

        System.out.println("You consume " + units +
                " units and your electricity bill is: " + bill);

        System.out.println("\n**********");
        sc.close();
    }
}
