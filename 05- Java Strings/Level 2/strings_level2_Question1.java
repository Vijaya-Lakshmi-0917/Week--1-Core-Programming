import java.util.*;
public class strings_level2_Question1 {
    public static int lengthOfAString(String string1){
        int i=0;
        int count=0;
        while(true){
            try {
                string1.charAt(i);
                count++;
            }
            catch (Exception e){
                return count;
            }
            i++;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String string1= sc.nextLine();
        int count=lengthOfAString(string1);
        System.out.println("the length of the string: "+ count);
    }
}
