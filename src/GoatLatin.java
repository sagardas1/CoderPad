public class GoatLatin {
    public static String toGoatLatin(String sentence) {
        String k="";
        int l=0;
        int j=0;
        for(String s:sentence.split(" ")){
            l+=1;
            j=l;

            if(s.charAt(0)=='a'||s.charAt(0)=='e'||s.charAt(0)=='i'||s.charAt(0)=='o'||s.charAt(0)=='u'||s.charAt(0)=='A'||s.charAt(0)=='E'||s.charAt(0)=='I'||s.charAt(0)=='O'||s.charAt(0)=='U'||s.charAt(0)=='a'){
                s+="ma";
                while(j!=0){
                    s+="a";
                    j-=1;
                }
                k+=s+" ";
            }else{
                String v=s.substring(1,s.length());
                v+=s.charAt(0)+""+"ma";
                while(j!=0){
                    v+="a";
                    j-=1;
                }
                k+=v+" ";




            }
        }
        return k.trim();
    }
}
