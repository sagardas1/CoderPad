public class Avoid1576 {
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
