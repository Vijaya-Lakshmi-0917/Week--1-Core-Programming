import java.util.*;
public class strings_level2_Question5 {
    public static String vowelOrConsonant(char c) {
        if (c >= 'A' && c <= 'Z') {
            c = (char) ((char) c + 32);
        }
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "vowel";
            } else {
                return "consonant";
            }
        } else {
            return "Not a Letter";

        }
    }
    public static int[] countOfVowelsAndConsonants(String string1) {
        int[] countOfVowelsAndConsonantsArray = new int[2];
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i<string1.length(); i++) {
            char c = string1.charAt(i);
            String result=vowelOrConsonant(c);
            if (result == "vowel") {
                vowelCount++;
            } else if (result == "consonant") {
                consonantCount++;
            }
        }
        countOfVowelsAndConsonantsArray[0] = vowelCount;
        countOfVowelsAndConsonantsArray[1] = consonantCount;
        return countOfVowelsAndConsonantsArray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string1 = sc.nextLine();
        int[] countOfVowelsAndConsonantsArray = countOfVowelsAndConsonants(string1);
        System.out.println("The total number of vowels: " + countOfVowelsAndConsonantsArray[0]);
        System.out.println("The total number of Consonants: " + countOfVowelsAndConsonantsArray[1]);
    }
}
