import java.util.*;
public class extras_strings_Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String string1 = sc.next();
        String reversedString = "";
        for (
                int i = string1.length() - 1;
                i >= 0; i--) {
            reversedString += string1.charAt(i);
        }
        boolean isPalindrome=true;
        for (int i = 0; i < string1.length(); i++){
            if(string1.charAt(i)!=reversedString.charAt(i)){
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("The given string is a palindrome");
        }
        else{
            System.out.println("The given string is a not palindrome");
        }
    }
}


