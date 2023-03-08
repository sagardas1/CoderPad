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
}
