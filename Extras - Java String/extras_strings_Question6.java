import java.util.*;
public class extras_strings_Question6 {
    public static int countSubstringOccurrences(String string1, String subString) {
        int count = 0;

        for (int i = 0; i <= string1.length() - subString.length(); i++) {
            int j;
            for (j = 0; j < subString.length(); j++) {
                if (string1.charAt(i + j) != subString.charAt(j)) {
                    break;
                }
            }
            if (j == subString.length()) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String string1 = sc.nextLine();
        System.out.println("Enter the sub-string");
        String subString = sc.next();

        int count = countSubstringOccurrences(string1, subString);
        System.out.println("Substring '" + subString + "' occurs " + count + " times in the given string");
    }
}
