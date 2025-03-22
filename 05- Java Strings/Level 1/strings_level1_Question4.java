import java.util.*;
public class strings_level1_Question4 {
    public static void tryAndCatch(){
        try{
            String string1=null;
            string1.toLowerCase();
        }
        catch(Exception e){
            System.out.println(" String1 is equal to null");
        }
    }
    public static void main(String[] args){
        tryAndCatch();
    }
}
