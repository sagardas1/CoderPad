public class StringPercentage {
    public static int percentageLetter(String s, char letter) {
        int count=0;
        for(char c:s.toCharArray()){
            if(c==letter)count+=1;
        }
        return (count*100)/s.length();
    }
}
