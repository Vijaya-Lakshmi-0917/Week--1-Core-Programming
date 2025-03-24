import java.util.*;
public class extras_strings_Question5 {
    public static void main(String[] args) {
        StringBuilder currentWord= new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String string1 = sc.nextLine();
        String longestWord=" ";
        int length=0;
        int count =1;
        for(int i=0; i<string1.length();i++){
            char c=string1.trim().charAt(i);
            if(c!=' '){
                currentWord.append(c);
            }
            else{
                currentWord.toString();
                if(currentWord.length()>length){
                    longestWord=String.valueOf(currentWord);
                    currentWord.setLength(0);
                }
            }
        }
        if(currentWord.toString().length()!=0) {
            if (currentWord.length() > length) {
                longestWord = String.valueOf(currentWord);
            }
        }
        System.out.println("The longest word in the string is: "+ longestWord);
    }
}
