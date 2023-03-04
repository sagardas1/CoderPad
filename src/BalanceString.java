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
        System.out.println(minimumDeletions("aababbab"));
    }

    public static String reformatNumber(String number) {
        number = number.replaceAll(" ", "");
        number = number.replaceAll("-", "");


        int value = number.length() / 3;

        String s = "";
        int count = 0;

        while (value != 0) {ß

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
