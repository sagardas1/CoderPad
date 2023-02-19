public class ValidPalindrom {

    public static boolean validPalindrome(String s) {
if(pal(s)){return true;
}
char[] c=s.toCharArray();
for(int i=0;i<s.length();i++){
  c[i]='\u0000';
  if(pal(String.valueOf(c))){return true; }
}
return false;
    }
    public static boolean pal(String str) {
        int left = 0, right = str.length() - 1;

        while(left < right)
        {
            if(str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(validPalindrome("abc"));
    }
}
