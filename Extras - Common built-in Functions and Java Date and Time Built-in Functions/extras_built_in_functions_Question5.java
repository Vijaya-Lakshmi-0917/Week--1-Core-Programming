import java.util.*;
public class extras_built_in_functions_Question5 {
    public static boolean palindrome(String string1) {
        boolean isPalindrome = true;
        for (int i = 0; i < string1.length(); i++) {
            char a = string1.charAt(i);
            char b = string1.charAt(string1.length()-1 - i);
            if (a != b) {
                isPalindrome= false;
                break;
            }
        }
        return isPalindrome;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String string1= sc.nextLine();
        System.out.println(palindrome(string1));
    }
}
