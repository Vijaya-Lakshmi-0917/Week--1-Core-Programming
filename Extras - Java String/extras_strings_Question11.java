import java.util.*;
public class extras_strings_Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string1 = sc.nextLine();
        String string2 = sc.nextLine();
        boolean isAnagram = true;
        string1 = string1.replace(" ", "").toLowerCase();
        string2 = string2.replace(" ", "").toLowerCase();
        if (string1.length() != string2.length()) {
            //System.out.println("The given strings are not anagrams.");
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
        }
        if(isAnagram){
            System.out.println("The given strings are anagrams.");
        }
        else{
            System.out.println("The given strings are not anagrams.");
        }
    }
}
