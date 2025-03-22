import java.util.*;
public class strings_level2_Question2 {
    public static int lengthOfAString(String string1) {
        int count = 1;
        for (int i = 0; i < string1.trim().length(); i++) {
            char c = string1.trim().charAt(i);
            if (c == ' ') {
                count++;
            }
        }
        return count;
    }
    public static String[] wordsSplit(int count, String string1) {
        String[] stringArray1 = new String[count];
        int index = 0;
        StringBuilder currentWord = new StringBuilder();
        for (int i = 0; i < string1.length(); i++) {
            char c = string1.charAt(i);
            if (c != ' ') {
                currentWord.append(c);
            } else {
                stringArray1[index] = currentWord.toString();
                currentWord.setLength(0);
                index++;
            }
        }
        if (currentWord.length() > 0) {
            stringArray1[index] = currentWord.toString();
        }
        return stringArray1;
    }
    public static boolean compareTwoStrings(int count,String[] stringArray1, String[] stringArray2){
        boolean isSame=true;
        for(int i=0; i<count; i++){
            if (stringArray1[i] == stringArray2[i]){
                isSame=false;
                break;
            }
        }
        return isSame;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string1 = sc.nextLine();
        int count=lengthOfAString(string1);
        String[] stringArray1 = wordsSplit(count, string1);
        String[] stringArray2= new String[count];
        stringArray2=string1.split("\\s+");
        System.out.println(compareTwoStrings(count, stringArray1, stringArray2));
    }
}

