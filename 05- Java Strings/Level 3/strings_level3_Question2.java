import java.util.*;
public class strings_level3_Question2 {
    public static int lengthOfString(String string1) {
        int count = 0;
        for (char c : string1.toCharArray()) {
            count++;
        }
        return count;
    }

    public static String[] uniqueCharacter(String string1, int count) {
        String[] resultArray = new String[count];
        int index = 0;
        for (int i = 0; i < count; i++) {
            char c = string1.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < count; j++) {
                if (i != j && c == string1.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                resultArray[index++] = String.valueOf(c);
            }
        }
        if (index < count) {
            for (int i = index; i < count; i++) {
                resultArray[i] = "";
            }
        }
        String[] uniqueCharactersArray = new String[index];
        if (index != count) {
            for (int i = 0; i < index; i++) {
                uniqueCharactersArray[i] = resultArray[i];
            }
            return uniqueCharactersArray;
        }
        else{
            return resultArray;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string1 = sc.nextLine();
        int count = lengthOfString(string1);
        String[] charactersArray = uniqueCharacter(string1, count);
        for (String i : charactersArray) {
            System.out.println(i);
        }
    }
}
