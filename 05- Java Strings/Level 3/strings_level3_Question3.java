import java.util.*;
public class strings_level3_Question3 {
    public static char frequencyOfCharacters(String string1){
        int[] frequencyArray= new int[256];
        for(int i=0; i<string1.length(); i++){
            char c= string1.charAt(i);
            frequencyArray[c]++;
        }
        for(int i=0; i<string1.length(); i++){
            char c= string1.charAt(i);
            if(frequencyArray[c]==1){
                return c;
            }
        }
        return '\0';
    }
    public static void main(String [] args ){
        Scanner sc= new Scanner(System.in);
        String string1= sc.nextLine();
        char result= frequencyOfCharacters(string1);
        if(result!= '\0' ){
            System.out.printf("The first non-repeating character is: "+ result);
        }
        else{
            System.out.printf("There are no non-repeating characters");
        }
    }
}
