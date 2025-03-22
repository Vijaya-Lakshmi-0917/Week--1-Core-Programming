import java.util.*;
public class strings_level1_Question7 {
    public static void tryAndCatch(String string1) {
        try {
            int a = Integer.parseInt(string1);
        }
        catch(Exception e) {
            System.out.println("string cannot be converted into integer ");
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String string1=sc.next();
        tryAndCatch(string1);
    }
}
