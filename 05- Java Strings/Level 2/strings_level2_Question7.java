import java.util.*;
public class strings_level2_Question7 {
    public static int[] removeLeadingAndTrailingSpaces(String string1) {
        int start = 0;
        int end = string1.length()-1;
        while (string1.charAt(start) == ' ') {
            start++;
        }
        while (string1.charAt(end) == ' ') {
            end--;
        }
        int[] startAndEndPointArray= new int[2];
        startAndEndPointArray[0]=start;
        startAndEndPointArray[1]=end;
        return startAndEndPointArray;
    }
    public static String substring(String string1, int[] startAndEndPointArray){
        String subStringOfString1="";
        int start=startAndEndPointArray[0];
        int end=startAndEndPointArray[1];
        for (int i=start; i<=end; i++){
            subStringOfString1 += string1.charAt(i);
        }
        return subStringOfString1;
    }
    public static boolean compare(String string1, String subStringOfString1){
        string1=string1.trim();
        System.out.println("User built-in method :"+string1);
        System.out.println("User User-defined method :"+subStringOfString1);

        boolean isSame= true;
        for (int i =0; i<string1.length(); i++){
           if (string1.charAt(i)!=subStringOfString1.charAt(i)){
               isSame=false;
               break;
           }
        }
        return isSame;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String string1 = sc.nextLine();
        int[] startAndEndPointArray=removeLeadingAndTrailingSpaces(string1);
        String subStringOfString1=substring(string1,startAndEndPointArray);
        System.out.println(compare(string1,subStringOfString1));
    }
}
