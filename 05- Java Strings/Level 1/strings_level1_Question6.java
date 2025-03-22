import java.util.*;
public class strings_level1_Question6 {
    public static void tryAndCatch(int startIndex, int endIndex, String string1){
        String subString="";
        try {
            for (int i = startIndex; i < endIndex; i++) {
                subString += string1.charAt(i);
            }
        }
        catch(Exception e){
            System.out.println("String index out of bound");
        }

    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        String string1= sc.next();
        System.out.println("Enter the start index");
        int startIndex= sc.nextInt();
        System.out.println("Enter the end index");
        int endIndex= sc.nextInt();
        tryAndCatch(startIndex, endIndex, string1);
    }
}
