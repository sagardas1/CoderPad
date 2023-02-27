public class StrongPasswordChecker {

    public boolean strongPasswordCheckerII(String password) {
boolean lowercase=false;
boolean uppercase=false;
boolean specialCharacter=false;
boolean noAdjacent;
if(password.length()<8){return false;}
for(int i=1;i<password.length();i++){
if(password.charAt(i)==password.charAt(i-1)){return false;}
if(password.charAt(i)>=65 &&password.charAt(i)<=90){
    uppercase=true;
}
    if(password.charAt(i)>=97 &&password.charAt(i)<=122){
        lowercase=true;
    }
    if(password.charAt(i)=='!' ||
            password.charAt(i)=='+' ||
            password.charAt(i)=='-' ||
            password.charAt(i)==')' ||
            password.charAt(i)=='(' ||
            password.charAt(i)=='*' ||
            password.charAt(i)=='&' ||
            password.charAt(i)=='^' ||
            password.charAt(i)=='%' ||
            password.charAt(i)=='$' ||
            password.charAt(i)=='#' ||
            password.charAt(i)=='@'
    )
        specialCharacter=true;
}
if(lowercase&&specialCharacter&&uppercase){return true;}
else return false;
    }
}
