import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AlternateDigitSum {
    public int alternateDigitSum(int n) {
        if(n<10){return n;}
        String s=n+"";
        int k=Integer.valueOf(s.charAt(0)+"");
        for(int i=1;i<s.length();i++){
            if(i%2==0){
                k+=Integer.valueOf(s.charAt(i)+"");

            }else{

                k+=(-Integer.valueOf(s.charAt(i)+""));
            }
        }
        return k;

    }



    public static void main(String[] args) {
Set<Integer> n=Set.of(2,4,6,8);
n.stream().takeWhile(i->i%2==0).forEach(System.out::println);

    }

    public int h(int i, int j){
        return i+j;
    }
}
interface Card {
    private Long createCardId(){
       return 0L;
    }
    private static void displayCardDetails(){

    }
}