import java.util.*;
public class strings_level2_Question6 {
    public static String vowelOrConstant(char c) {
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

    public static String[][] vowelsAndConsonants(String string1, int count) {
        String[][] vowelsAndConsonantsArray = new String[count][2];
        for (int i = 0; i< count; i++) {
            char c = string1.trim().charAt(i);
            if (vowelOrConstant(c) == "vowel"){
                vowelsAndConsonantsArray[i][0]=String.valueOf(c);
                vowelsAndConsonantsArray[i][1]="vowel";
            }
            else if (vowelOrConstant(c) == "consonant"){
                vowelsAndConsonantsArray[i][0]=String.valueOf(c);
                vowelsAndConsonantsArray[i][1]="consonant";
            }
            else if(vowelOrConstant(c) == " "){
                i--;
            }
            else{
                vowelsAndConsonantsArray[i][0]=String.valueOf(c);
                vowelsAndConsonantsArray[i][1]="Not a Letter";
            }
        }
        return vowelsAndConsonantsArray;
    }
    public static void display(String [][] vowelsAndConsonantsArray, String string1, int count){
        System.out.printf("%15s %15s\n" , "Character", "type");
        for (int i=0; i<count ; i++){
            System.out.printf("%15s %15s\n",vowelsAndConsonantsArray[i][0], vowelsAndConsonantsArray[i][1]);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String string1 = sc.nextLine();
        string1= string1.replaceAll(" ","");
        int count=0;
        for (int i=0; i< string1.length(); i++){
            char c= string1.charAt(i);
            if (c!=' '){
                count++;
            }
        }

        String [][]vowelsAndConsonantsArray=vowelsAndConsonants(string1, count);
        display(vowelsAndConsonantsArray, string1, count);
    }
}

