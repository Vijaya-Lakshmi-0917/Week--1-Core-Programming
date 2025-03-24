import java.util.*;
public class extras_strings_Question12 {
    public static String replace(String string1, String wordToBeReplaced, String replacementWord) {
        String modifiedString = "";
        int i = 0;
        while (i < string1.length()) {
            int j = 0;
            while ((i + j < string1.length() && j < wordToBeReplaced.length() && string1.charAt(i + j) == wordToBeReplaced.charAt(j))){
                j++;
            }
            boolean isMatch = (j == wordToBeReplaced.length()) && (i + j == string1.length() || !Character.isLetterOrDigit(string1.charAt(i + j))) && (i == 0 || !Character.isLetterOrDigit(string1.charAt(i - 1)));
            if (isMatch) {
                modifiedString += replacementWord;
                i += wordToBeReplaced.length();
            } else {
                modifiedString += string1.charAt(i);
                i++;
            }
        }
        return modifiedString;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String string1 = sc.nextLine();
        System.out.println("Enter the word to be replaced");
        String wordToBeReplaced = sc.nextLine();
        System.out.println("Enter the replacement word");
        String replacementWord = sc.nextLine();
        System.out.println(replace(string1, wordToBeReplaced, replacementWord));
    }
}
