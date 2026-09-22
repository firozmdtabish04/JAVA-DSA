import java.util.*;

public class WordBreakEasy {

    static boolean check(String s, String[] words) {
        if (s.length() == 0)
            return true;

        for (String word : words) {
            if (s.startsWith(word)) {
                if (check(s.substring(word.length()), words))
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "mdtabishFirozAkhil";
        String[] words = { "tabish", "md" , ""};

        System.out.println(check(s, words)); // true
    }
} 