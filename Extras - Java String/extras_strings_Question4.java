import java.util.*;
public class extras_strings_Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String string1 = sc.next();
        String duplicatesRemovedString = "";
        for (int i = 0; i < string1.length(); i++) {
            char c = string1.charAt(i);
            boolean isRepeated = false;
            for (int j = 0; j < duplicatesRemovedString.length(); j++) {
                if (string1.charAt(i) == duplicatesRemovedString.charAt(j)) {
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                duplicatesRemovedString += c;
            }
        }
        System.out.println("Duplicates removed string\n"+duplicatesRemovedString);
    }
}
