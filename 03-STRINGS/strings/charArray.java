import java.util.Scanner;

public class charArray {
    public static void main(String[] args) {
        char[] ch = new char[6];
        ch[0] = 'T';
        ch[1] = 'A';
        ch[2] = 'B';
        ch[3] = 'I';
        ch[4] = 'S';
        ch[5] = 'H';
        System.out.println(ch);

        char[] name = { 't', 'a', 'b', 'i', 's', 'h' };
        System.out.println(name);

        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Size of array: ");
        size = sc.nextInt();
        char[] inpChar = new char[size]; // create array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter character " + (i + 1) + ": ");
            inpChar[i] = sc.next().charAt(0);
        }
        System.out.println("\nCharacters in array:");
        for (int i = 0; i < size; i++) {
            System.out.print(inpChar[i] + " ");
        }
        sc.close();
    }
}
