/**
 * ArmstrongNumber Beginner
 */
public class ArmstrongNumber {

    public static void main(String[] args) {
        int num = 370;
        int original = num;
        int digits = String.valueOf(num).length();
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        if (sum == original)
            System.out.println(original + " is a ArmstrongNumber");
        else
            System.out.println(original + " is not a ArmstrongNumber");
    }
}
