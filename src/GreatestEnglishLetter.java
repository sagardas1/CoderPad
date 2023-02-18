public class GreatestEnglishLetter {

    public static String greatestLetter(String s) {
        char k='\u0000';
for(char c:s.toCharArray()){
    String ll=c+"";
    ll=ll.toLowerCase();
    if(c>=65 && c<=90 && s.contains(ll)){
        if(k=='\u0000'){
            k=c;

        }else{
            if(k<c){
                k=c;
            }
        }
    }
}
if(k=='\u0000'){
    return "";

}
return k+"";
    }

    public static void main(String[] args) {
        System.out.println(greatestLetter("zyZY"));
    }
}
