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

    public static void main(String[] args) {
        int a[]={1,2,3,4};
        System.out.println(countPairs(a, 1));
    }

    public static int countPairs(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j] && (i*j)%k==0){
                    count+=1;
                }
            }

        }
        if(count==0) return 0;
        return count;
    }
    public static int balancedStringSplit(String s) {
        int r = 0;
        int l = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                r += 1;
            }
            if (s.charAt(i) == 'L') {
                l += 1;
            }
            if (r == l) {
                count += 1;
                r = 0;
                l = 0;
            }
        }
        if (r == l) {
            count += 1;
        }
        return count;
    }
}
