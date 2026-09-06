public class RomanInt {

    public int romanToInt(String s) {

        int total = 0;
        int previous = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int current = value(s.charAt(i));
            if (current < previous)
                total -= current;
            else
                total += current;
            previous = current;
        }

        return total;
    }

    private int value(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }

    public static void main(String[] args) {

        RomanInt obj = new RomanInt();

        System.out.println(obj.romanToInt("MCMXCIV"));
    }
}