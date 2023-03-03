import java.util.Arrays;

public class SortestDistancetoword {

    public static int closetTarget(String[] words, String target, int startIndex) {
        int count1 = 0;
        int count2 = 0;
        if (words[startIndex].equals(target)) return 0;
        if (!Arrays.asList(words).contains(target)) return -1;
        int i = startIndex;
        int j = startIndex;
        while (!words[i].equals(target)) {
            if (i != 0) {
                i--;
                count1 += 1;
            } else {
                i = words.length - 1;
                count1 += 1;
            }
        }
        while (!words[j].equals(target)) {
            if (j != words.length - 1) {
                j++;
                count2 += 1;
            } else {
                j = 0;
                count2 += 1;
            }

        }

        if (count1 <= count2) {
            return count1;
        } else return count2;
    }
}
