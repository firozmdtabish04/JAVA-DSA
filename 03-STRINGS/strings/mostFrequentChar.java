import java.util.Scanner;

public class mostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Word: ");
        String str = sc.nextLine();

        // System.out.println("Word " + str);

        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int max = -1;
        char result = ' ';

        // Find character with maximum frequency
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] > max) {
                max = freq[str.charAt(i)];
                result = str.charAt(i);
            }
        }

        System.out.println("Most frequent character: " + result);
        System.out.println("Frequency: " + max);
    }
}