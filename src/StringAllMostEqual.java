import java.util.*;

public class StringAllMostEqual {
    public static boolean checkAlmostEquivalent(String word1, String word2) {
        int num = 0;

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char c : word1.toCharArray()) {
            if (map1.containsKey(c)) {
                map1.put(c, map1.get(c) + 1);
            } else {
                map1.put(c, 1);
            }
        }
        for (char c : word2.toCharArray()) {
            if (map2.containsKey(c)) {
                map2.put(c, map2.get(c) + 1);
            } else {
                map2.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            if (map2.containsKey(entry.getKey())) {
                int i = Math.abs(entry.getValue() - map2.get(entry.getKey()));
                if (num < i) {
                    num = i;
                }
            } else {
                if (num < entry.getValue()) {
                    num = entry.getValue();
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : map2.entrySet()) {
            if (map1.containsKey(entry.getKey())) {
                int i = Math.abs(entry.getValue() - map1.get(entry.getKey()));
                if (num < i) {
                    num = i;
                }
            } else {
                if (num < entry.getValue()) {
                    num = entry.getValue();
                }
            }
        }
        if (num > 3) {
            return false;
        } else return true;

    }
}
