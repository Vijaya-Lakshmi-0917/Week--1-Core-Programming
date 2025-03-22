import java.util.*;
import java.lang.*;
public class strings_level1_Question2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String string1 = sc.nextLine();
        int startIndex=sc.nextInt();
        int endIndex=sc.nextInt();
        String subString1 = "";
        for (int i = startIndex; i< endIndex; i++) {
            subString1 += string1.charAt(i);
        }
        String subString2="";
        subString2+= string1.substring(startIndex,endIndex);
        if (subString1.equals(subString2)){
            System.out.println(true);
            System.out.println("The two substrings are equal. ");
        }
        else{
            System.out.println(false);
            System.out.println("The two substrings are not equal. ");
        }
        System.out.println(subString1+" "+subString2);
    }
}

