import java.util.Stack;

public class FancyString {
    //1957
    public static String makeFancyString(String s) {

        Stack<Character> stack=new Stack<>()
                ;
        int k=0;

        for(char c:s.toCharArray()){
           if(stack.empty()){
               stack.add(c);
               k+=1;
           }else {

               if (k == 2) {
                   if (stack.peek() == c) {
                       k = 0;
                   } else {
                       k = 1;
                       stack.add(c);
                   }
               } else {
                   if (stack.peek() == c) {
                       stack.add(c);
                       k += 1;
                   } else {
                       stack.add(c);
                       k = 1;
                   }
               }
           }

        }
        String s1="";
        char aa[]=new char[stack.size()];
        int j=aa.length-1;
        while (!stack.empty()){
            aa[j]=stack.pop();
            j--;
        }
        return String.valueOf(aa);

    }

    public static void main(String[] args) {
        System.out.println(makeFancyString("leeetcode"));
    }
}
