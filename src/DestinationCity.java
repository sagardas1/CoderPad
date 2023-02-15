import java.util.*;

class DestinationCity {

    public String destCity(List<List<String>> paths) {
        String start = paths.get(0).get(0);
        Map<String, Integer> map = new HashMap<>();
        for (List<String> i : paths) {
            for (String s : i) {
                if (map.containsKey(s)) {
                    map.put(s, map.get(s) + 1);

                } else {
                    map.put(s, 1);
                }
            }
        }

        for (Map.Entry<String, Integer> en : map.entrySet()) {
            if (en.getValue() == 1 && !en.getKey().equals(start)) {
                return en.getKey();

            }
        }

        return "";
    }
}