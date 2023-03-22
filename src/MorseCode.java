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
            System.out.println("s-->>" + s);
            String ll = "";
            for (String kk : s.split("")) {
                System.out.println("kk---->>" + kk);

                ll += k[l.indexOf(kk)];
            }
            set.add(ll);

        }
        return set.size();
    }
}
