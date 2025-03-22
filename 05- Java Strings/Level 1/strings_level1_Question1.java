import java.util.*;
public class strings_level1_Question1 {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        String string1=sc.next();
        String string2=sc.next();
        boolean isEqual=false;
        if(string1.length()!=string2.length()) {
            isEqual=false;
        }
        else {
            for (int i = 0; i < string1.length(); i++) {
                if (string1.charAt(i) == string2.charAt(i)) {
                    isEqual = true;
                }
            }
        }
        System.out.println(isEqual);
        if(string1.equals(string2)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
