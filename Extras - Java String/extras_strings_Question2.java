import java.util.*;
public class extras_strings_Question2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String string1= sc.next();
        String reversedString="";
        for(int i=string1.length()-1; i>=0; i--){
            reversedString+= string1.charAt(i);
        }
        System.out.println("The reversed string is: "+reversedString);
    }
}
