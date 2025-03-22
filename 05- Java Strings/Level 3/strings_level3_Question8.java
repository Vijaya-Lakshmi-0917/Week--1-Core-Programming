import java.util.*;
public class strings_level3_Question8 {
    public static boolean anagrams(String string1, String string2) {
        boolean isAnagram = true;
        string1 = string1.replace(" ", "").toLowerCase();
        string2 = string2.replace(" ", "").toLowerCase();
        if (string1.length() != string2.length()) {
            return false;
        }
        int[] frequencyOfString1 = new int[26];
        int[] frequencyOfString2 = new int[26];
        for (int i = 0; i < string1.length(); i++) {
            char c = string1.charAt(i);
            if (c > 'a' && c < 'z') {
                frequencyOfString1[c - 'a']++;
            }
        }
        for (int i = 0; i < string1.length(); i++) {
            char c = string2.charAt(i);
            if (c > 'a' && c < 'z') {
                frequencyOfString2[c - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (frequencyOfString1[i] != frequencyOfString2[i]) {
                isAnagram = false;
                break;
            }
        }
        return isAnagram;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string1 = sc.nextLine();
        String string2 = sc.nextLine();
        System.out.println(anagrams(string1, string2));
    }
}
