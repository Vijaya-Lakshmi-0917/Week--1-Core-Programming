import java.util.*;
public class extras_strings_Question7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String string1 = sc.next();
        String string2 ="";
        for(int i=0; i<string1.length(); i++){
            char c= string1.charAt(i);
            if(c>=65 && c<=90){
                string2+=String.valueOf(Character.toLowerCase(string1.charAt(i)));
            }
            if(c>=97 && c<=122){
                Character.toUpperCase(string1.charAt(i));
                string2+=String.valueOf(Character.toUpperCase(string1.charAt(i)));
            }
        }
        System.out.println(string2);
    }
}
