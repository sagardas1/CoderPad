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
}
