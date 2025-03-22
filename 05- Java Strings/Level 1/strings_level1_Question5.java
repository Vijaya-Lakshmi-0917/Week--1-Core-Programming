import java.util.*;
public class strings_level1_Question5 {
    public static void tryAndCatch(){
        try{
            String string1="Try and catch";
            string1.charAt(21);
        }
        catch(Exception e){
            System.out.println(" String1 is out of index");
        }
    }
    public static void main(String[] args){
        tryAndCatch();
    }
}

