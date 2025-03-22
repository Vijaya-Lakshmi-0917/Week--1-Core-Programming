import java.util.*;
public class strings_level3_Question7 {
    public static boolean startAndEndMethod(String string1){
        boolean isPalindrome= true;
        int startIndex=0;
        int endIndex=string1.length() -1;
        for(int i=startIndex; i<=endIndex; i++){
            if(string1.charAt(i)!=string1.charAt(endIndex-i)){
                isPalindrome=false;
                break;
            }
        }
        return isPalindrome;
    }
    public static boolean recursiveMethod(String string1){
        int startIndex=0;
        int endIndex=string1.length() -1;
        if(string1.charAt(startIndex)!=string1.charAt(endIndex)){
            return false;
        }
        recursiveMethod(string1.substring(1, endIndex-1));
        return true;
    }
    public static boolean stringReversalMethod(String string1){
        StringBuilder reversedString= new StringBuilder();
        boolean isPalindrome= true;
        int startIndex=0;
        int endIndex=string1.length() -1;
        for(int i=endIndex; i>=startIndex; i--) {
            reversedString.append(string1.charAt(i));
        }
        reversedString.toString();
        for(int i=0; i<=endIndex; i++){
            if(string1.charAt(i)!=reversedString.charAt(i)){
                isPalindrome=false;
                break;
            }
        }
        return isPalindrome;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String string1 = sc.next();
        System.out.println(stringReversalMethod(string1));
        System.out.println(recursiveMethod(string1));
        System.out.println(startAndEndMethod(string1));
    }
}
