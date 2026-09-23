
public class checkVowelConsonants {
    public static void main(String[] args) {
        String str = "Abhilipsa";
        
        int vowel = 0;
        int constant = 0;
        System.out.println("\n Given String");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                        || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    System.out.println(ch + " -> Vowel -> "+i);
                    vowel++;
                } else {
                    System.out.println(ch + " -> constant -> "+ i);
                    constant++;
                }
            }

        }
        System.out.println("\nVowel in given string: " + vowel);
        System.out.println("constant in given string: " + constant);

    }
}
