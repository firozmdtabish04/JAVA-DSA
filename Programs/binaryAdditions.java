package Programs;

public class binaryAdditions {
    public static void main(String[] args) {

        String a = "1010";
        String b = "1101";

        // Convert binary to decimal
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);

        // Add numbers
        int sum = num1 + num2;

        // Convert back to binary
        String result = Integer.toBinaryString(sum);

        System.out.println("Binary Addition Result: " + result);
    }
}
