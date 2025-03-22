import java.util.*;
public class strings_level3_Question5{
    public static String [] uniqueCharacters(String string1){
        StringBuilder unique= new StringBuilder();
        for (int i=0; i<string1.length(); i++){
            char c= string1.charAt(i);
            boolean isUnique= false;
            for(int j=0; j<i; j++){
                if(c==string1.charAt(j)){
                    isUnique= true;
                    break;
                }
            }
            if(!isUnique){
                unique.append(c);
            }
        }
        int l= unique.length();
        String[] uniqueCharactersArray = new String[l];
        for(int i=0; i<l;i++){
            uniqueCharactersArray[i]= String.valueOf(unique.charAt(i));
        }
        return uniqueCharactersArray;
    }
    public static String[][] frequencyOfCharacters(String string1) {
        String[] uniqueCharactersArray=uniqueCharacters(string1);
        int[] frequencyArray = new int[256];
        String[][]charactersWithFrequencies= new String[uniqueCharactersArray.length][2];
        for (int i = 0; i < string1.length(); i++) {
            char c = string1.charAt(i);
            frequencyArray[c]++;
        }
        for (int i = 0; i < uniqueCharactersArray.length; i++) {
            String c =String.valueOf(uniqueCharactersArray[i]);
            charactersWithFrequencies[i][0]= c;
            int v= c.charAt(0);
            charactersWithFrequencies[i][1]= String.valueOf(frequencyArray[v]);
        }
        return charactersWithFrequencies;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String string1=sc.nextLine();
        string1=string1.toLowerCase();
        String[][] array= frequencyOfCharacters(string1);
        for(String[] pair: array){
            System.out.println(pair[0]+" "+pair[1]);
        }
    }
}


