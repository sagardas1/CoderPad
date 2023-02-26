public class CircularString {
    public static void main(String[] args) {

    }
    public boolean isCircularSentence(String sentence) {
String arr[]=sentence.split(" ");
if(arr[0].charAt(0)==arr[arr.length-1].charAt((arr[arr.length-1]).length()-1)){

    for(int i=1;i<arr.length;i++){
        if(arr[i-1].charAt(arr[i-1].length()-1)==arr[i].charAt(0)){continue;}else{return false;}
    }
}else return false;
return true;
    }
}
