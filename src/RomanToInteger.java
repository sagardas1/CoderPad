import java.util.*;

public class RomanToInteger {

    public static int romanToInt(String s) {
int sum=0;
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5); map.put('X',10); map.put('L',50); map.put('C',100); map.put('D',500); map.put('M',1000);
        for(char c:s.toCharArray()){
            int i=map.get(c);
            sum+=map.get(c);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(modifyString("?zs"));
    }

    public static String modifyString(String s) {
        String k="";
        char c='a';
        char arr[]=s.toCharArray();
        if(s.length()==1 && s.charAt(0)=='?'  ){return "a";}
        if(s.length()==1 &&!s.contains("?"))return s;
        for(int i=0;i<arr.length;i++){
           if(i==0 && arr[i]=='?'){
               while(arr[i+1]==c){
                   c+=1;
               }
               arr[i]=c;
               c='a';

           }else{
if(arr[i]=='?') {
    while (arr[i]==c || arr[i + 1]==c) {
        c += 1;
    }
    arr[i] = c ;
    c = 'a';
}
           }


        }
      return  String.valueOf(arr);
    }
}
