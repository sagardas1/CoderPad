import java.util.*;

public class DecodeMessage {

    public static String decodeMessage(String key, String message) {
        char c = 'a';
        key = key.replaceAll(" ", "");
        key = key.trim();

        Set<Character> set = new HashSet<>();


        Map<Character, Character> map = new LinkedHashMap<>();
        for (char i : key.toCharArray()) {
            if (i != ' ' && set.add(i)) {
                map.put(i, c);
                c += 1;
            }
        }




        String w = "";
        for (char j : message.toCharArray()) {
            if (j != ' ')
                w += map.get(j) + "";
            else w += " ";
        }


        return w;
    }
}
