import java.util.*;
public class strings_level1_Question10 {
    public static String uppercaseUsingASCIIValue(String string1) {
        String string2 = "";
        for (int i = 0; i < string1.length(); i++) {
            int asciiValue = string1.charAt(i) + 32;
            char intToASCII = (char) asciiValue;
            string2 += intToASCII;
        }
        return string2;
    }

    public static Boolean comparision(String string2, String string3) {
        boolean isSame = true;
        for (int i=0; i<string2.length();i++){
            if (string3.charAt(i)!=string2.charAt(i)){
                isSame=false;
                break;
            }
        }
        return isSame;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string1 = sc.nextLine();
        String string2 = uppercaseUsingASCIIValue(string1);
        String string3 = string1.toLowerCase();
        System.out.println(comparision(string2, string3));
        System.out.println(string2+"  "+string3+"  "+string1);
    }
}
