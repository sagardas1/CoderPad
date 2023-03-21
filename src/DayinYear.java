import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DayinYear {
    public static int dayOfYear(String date) {
        Map<Integer, Integer> map = new HashMap<>();


        map.put(1, 31);
        map.put(2, 28);
        map.put(3, 31);
        map.put(4, 30);
        map.put(5, 31);
        map.put(6, 30);
        map.put(7, 31);
        map.put(8, 31);
        map.put(9, 30);
        map.put(10, 31);
        map.put(11, 30);
        map.put(12, 31);


        String arr[] = date.split("-");
        boolean flag = isLeap(Integer.valueOf(arr[0]));
        int days = 0;
        for (int i = 1; i < Integer.valueOf(arr[1]); i++) {
            if (i == 2) {
                if (flag)
                    days += 29;
                else days += 28;
            } else {
                days += map.get(i);


            }


        }

        days += Integer.valueOf(arr[2]);
        return days;

    }

    public static boolean isLeap(int year) {
        return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }


    public static boolean digitCount(String num) {
        Map<String, Integer> map1 = new HashMap<>();
        int val = 0;
        for (int i = 0; i < num.length(); i++) {
            if (val < Integer.valueOf(num.charAt(i) + "")) {
                val = Integer.valueOf(num.charAt(i) + "");
            }
            if (map1.containsKey(num.charAt(i) + "")) {
                map1.put(num.charAt(i) + "", map1.get(num.charAt(i) + "") + 1);
            } else {
                map1.put(num.charAt(i) + "", 1);
            }
        }
        if (num.length() == 1) {
            if (map1.containsKey(0 + "")) {
                if (map1.get(0 + "") == Integer.valueOf(num)) {
                    return true;
                } else return false;
            } else return false;

        }

        for (int i = 0; i <= val; i++) {
            if (map1.containsKey(i + "")) {
                int k = map1.get(i + "");
                int j = (int) Integer.valueOf(num.charAt(i) + "");
                if (k != j) {
                    return false;
                }
            }
        }
        return true;


    }


    public static boolean isIsomorphic(String t, String s) {

        //pattern "hbvhdsvhb"
        //s ="hvdhv hhsbdhbv jnjjs"
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        if (s.length() != t.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            if (map1.containsKey(s.charAt(i)) && map1.get(s.charAt(i)) != t.charAt(i)) return false;
            if (map2.containsKey(t.charAt(i)) && !map2.get(t.charAt(i)).equals(s.charAt(i))) return false;
            map1.put(s.charAt(i), t.charAt(i));
            map2.put(t.charAt(i), s.charAt(i));
        }

        if (map1.size() != map2.size()) {
            return false;
        }


        for (Map.Entry<Character, Character> en : map1.entrySet()) {
            if (en.getKey().equals(map2.get(en.getValue()))) {
            } else {
                return false;
            }
        }
        return true;

    }

    public static boolean wordPattern(String pattern, String s) {

        //pattern "hbvhdsvhb"
        //s ="hvdhv hhsbdhbv jnjjs"
        Map<String, Character> map1 = new HashMap<>();
        Map<Character, String> map2 = new HashMap<>();
        String ar[] = s.split(" ");
        if (ar.length != pattern.length()) return false;
        for (int i = 0; i < ar.length; i++) {
            if (map1.containsKey(ar[i]) && map1.get(ar[i]) != pattern.charAt(i)) return false;
            if (map2.containsKey(pattern.charAt(i)) && !map2.get(pattern.charAt(i)).equals(ar[i])) return false;
            map1.put(ar[i], pattern.charAt(i));
            map2.put(pattern.charAt(i), ar[i]);
        }

        if (map1.size() != map2.size()) {
            return false;
        }


        for (Map.Entry<String, Character> en : map1.entrySet()) {
            if (en.getKey().equals(map2.get(en.getValue()))) {
            } else {
                return false;
            }
        }
        return true;

    }


    public static void main(String args[]) throws Exception {
        System.out.println(pivotInteger(8));
    }

    public static int passThePillow(int n, int time) {
        int j = 1;
        boolean flag = true;

        while (time != 0) {
            if (flag) {
                j += 1;
            } else {
                j -= 1;
            }

            if (j == n) {
                flag = false;
            }
            if (j == 0) {
                flag = true;
            }

            time -= 1;
        }
        return j;
    }


    public static int pivotInteger(int n) {
        int k = 0;
        for (int i = 0; i <= n; i++) {
            k += i;
        }
        int j = 0;
        while (k != 0) {
            j += n;
            if (j == k) {
                return n;
            }
            k -= n;

            n -= 1;


        }
        return -1;
    }


    public static int divide(int dividend, int divisor) {
        BigInteger bigInteger1 = new BigInteger(String.valueOf(dividend));
        BigInteger bigInteger2 = new BigInteger(String.valueOf(divisor));
        BigInteger l = bigInteger1.divide(bigInteger2);
        int k = (int) (Math.pow(2, 31) - 1);
        int y = (int) -(Math.pow(2, 31));
        if (l.longValue() > Math.pow(2, 31) - 1) return (int) Math.pow(2, 31) - 1;
        else if (l.longValue() < -(Math.pow(2, 31))) return (int) -(Math.pow(2, 31));
        else return l.intValue();

    }


    public int sumBase(int n, int k) {
        String l = Integer.toString(
                Integer.parseInt(n + "", 10), k);
        int j = 0;
        for (char c : l.toCharArray()) {
            j += Integer.valueOf(c + "");
        }
        return j;
    }

    public static List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> list = new ArrayList<>();
        String k = "";
        for (int i : nums) {
            k += i;
            if (Integer.parseInt(k, 2) % 5 == 0) {
                list.add(true);
            } else list.add(false);
        }
        return list;
    }

}
