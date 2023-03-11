import java.util.HashMap;
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

    public static boolean isIsomorphic(String t, String s) {

        //pattern "hbvhdsvhb"
        //s ="hvdhv hhsbdhbv jnjjs"
        Map<Character,Character> map1=new HashMap<>();
        Map<Character,Character> map2=new HashMap<>();

        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            if(map1.containsKey(s.charAt(i))&& map1.get(s.charAt(i))!=t.charAt(i)) return false;
            if(map2.containsKey(t.charAt(i))&&  !map2.get(t.charAt(i)).equals(s.charAt(i))) return false;
            map1.put(s.charAt(i),t.charAt(i));
            map2.put(t.charAt(i),s.charAt(i));
        }

        if(map1.size()!=map2.size()){return false;}


        for(Map.Entry<Character,Character> en:map1.entrySet()){
            if(en.getKey().equals(map2.get(en.getValue()))){}else{return false;}
        }
        return true;

    }
    public static boolean wordPattern(String pattern, String s) {

        //pattern "hbvhdsvhb"
        //s ="hvdhv hhsbdhbv jnjjs"
        Map<String,Character> map1=new HashMap<>();
        Map<Character,String> map2=new HashMap<>();
        String ar[]=s.split(" ");
        if(ar.length!=pattern.length()) return false;
        for(int i=0;i<ar.length;i++){
if(map1.containsKey(ar[i])&& map1.get(ar[i])!=pattern.charAt(i)) return false;
            if(map2.containsKey(pattern.charAt(i))&&  !map2.get(pattern.charAt(i)).equals(ar[i])) return false;
            map1.put(ar[i],pattern.charAt(i));
            map2.put(pattern.charAt(i),ar[i]);
        }

        if(map1.size()!=map2.size()){return false;}


        for(Map.Entry<String,Character> en:map1.entrySet()){
            if(en.getKey().equals(map2.get(en.getValue()))){}else{return false;}
        }
        return true;

    }
}
