import java.util.*;
public class extras_strings_Question1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String string1= sc.next();
        int countVowel=0;
        int countConsonant=0;
        for(int i=0; i<string1.length(); i++){
            char c=string1.toLowerCase().charAt(i);
            if(c=='a' || c=='e' ||c=='i' ||c=='o' ||c=='u'){
                countVowel++;
            }
            else if(!(c>=32 && c<=64)){
                countConsonant++;
            }
        }
        System.out.println("The count of vowels in the string is "+ countVowel);
        System.out.println("The count of consonant in the string is "+ countConsonant);
    }
}
