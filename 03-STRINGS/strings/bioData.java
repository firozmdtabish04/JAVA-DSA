import java.util.Scanner;

public class bioData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        char bloodGroup;
        String address;
        System.out.print("Enter Your Name: ");
        name = sc.nextLine();
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        System.out.print("Enter Your blood group: ");
        bloodGroup = sc.next().charAt(0);
        sc.nextLine();
        System.out.print("Add your address: ");
        address = sc.nextLine();

        System.out.println("\nHii my name is " + name + " and i am " + age + " years old " + " my bloodgroup is "
                + bloodGroup + " and i am from " + address);

        sc.close();

    }
}
