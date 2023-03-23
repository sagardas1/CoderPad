import java.util.HashSet;
import java.util.Set;

public class MorseCode {
    public static int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        String k[] = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String l = "";

        int i = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            l += c + "";
        }


        for (String s : words) {
            String ll = "";
            for (String kk : s.split("")) {

                ll += k[l.indexOf(kk)];
            }
            set.add(ll);

        }
        return set.size();
    }
}
