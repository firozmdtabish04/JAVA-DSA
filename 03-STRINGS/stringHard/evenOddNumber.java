public class evenOddNumber {
    public static void main(String[] args) {
        long num = 24866842;
        String str = String.valueOf(num);
        int odd = 0;
        int even = 0;
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                if (ch == '2' || ch == '4' || ch == '6' || ch == '8') {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        System.out.println("\nTotal even digit in given number: " + even);
        System.out.println("Total odd digit in given number: " + odd);
    }
}
