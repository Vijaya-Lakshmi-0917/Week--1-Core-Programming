import java.util.*;
public class strings_level1_Question3 {
    public  static char[] toCharacterArray(String string1) {
        char[] charArray1 = new char[string1.length()];
        for (int i = 0; i < string1.length(); i++) {
            charArray1[i] = string1.charAt(i);
        }
        return charArray1;
    }
    public static boolean compare(String string1, char[] charArray2, char[] charArray1){
        boolean isSame = false;
        for (int i = 0; i < string1.length(); i++) {
            if (charArray1[i] !=charArray2[i]) {
                isSame = false;
                break;
            } else {
                isSame = true;
            }
        }
    return isSame;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string1 = sc.next();
        char[] charArray2 = string1.toCharArray();
        char[] charArray1 = toCharacterArray(string1);
        System.out.println(compare(string1, charArray2, charArray1));
    }
}
