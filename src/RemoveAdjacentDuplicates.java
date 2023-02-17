public class RemoveAdjacentDuplicates {
    public static String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        String k="";
        for(char c:s.toCharArray()){
            if(stack.empty()){
                stack.add(c);
            }else {

                if (stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.add(c);
                }
            }

        }
        while(!stack.empty()){
            k+=stack.pop()+"";
        }
        char[] c=k.toCharArray();
        int j=c.length-1;
        for(int i=0;i<c.length/2;i++){
            char z=c[i];
            c[i]=c[j];
            c[j]=z;
            j-=1;

        }

        return String.valueOf(c);
    }
}
