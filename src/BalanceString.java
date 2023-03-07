import java.util.*;

public class BalanceString {
    public static int minimumDeletions(String s) {

        char arr[] = s.toCharArray();
        int count = 0;


        boolean flag = false;
        if (s.replaceAll("a", "").length() == 0 || s.replaceAll("b", "").length() == 0) return 0;
        for (int i = 0; i < arr.length; i++) {
            flag = false;
            for (int j = i + 1; j < arr.length; j++) {


                if (arr[i] == 'b' && arr[j] == 'a') {


                    flag = true;
                }
            }
            if (flag) {
                count += 1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s[] = {"hello", "world", "leetcode"};


        System.out.println(countCharacters(s, "welldonehoneyr"));
    }

    public static int countCharacters(String[] words, String chars) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : chars.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int sum = 0;
        for (String s : words) {
            Map<Character, Integer> map1 = new HashMap<>();
            for (char c : s.toCharArray()) {
                if (map1.containsKey(c)) {
                    map1.put(c, map1.get(c) + 1);
                } else {
                    map1.put(c, 1);
                }
            }
            boolean flag = false;
            for (Map.Entry<Character, Integer> en : map1.entrySet()) {
                if (map.containsKey(en.getKey()) && map.get(en.getKey()) >= en.getValue()) {
                } else {
                    flag = true;
                    break;
                }
            }


            if (!flag) {
                sum += s.length();
            }

        }


        return sum;
    }

    public static String reformatNumber(String number) {
        number = number.replaceAll(" ", "");
        number = number.replaceAll("-", "");


        int value = number.length() / 3;

        String s = "";
        int count = 0;

        while (value != 0) {

            for (char c : number.toCharArray()) {
                s += c;
                count += 1;
                if (count == 3) {
                    s += '-';
                    count = 0;
                    value -= 1;
                }
            }
        }
        return "";
    }
}
