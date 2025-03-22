import java.util.*;
public class strings_level3_Question4{
    public static String[][] frequencyOfCharacters(String string1) {
        StringBuilder unique= new StringBuilder();
        for (int i=0; i<string1.length(); i++) {
            char c = string1.charAt(i);
            boolean isUnique = false;
            for (int j = 0; j < i; j++) {
                if (c == string1.charAt(j)) {
                    isUnique = true;
                    break;
                }
            }
            if (!isUnique) {
                unique.append(c);
            }
        }
        unique.toString();
        int[] frequencyArray = new int[256];
        String[][]charactersWithFrequencies= new String[unique.length()][2];
        for (int i = 0; i < string1.length(); i++) {
            char c = string1.charAt(i);
            frequencyArray[c]++;
        }
        for (int i = 0; i < unique.length(); i++) {
            String c =String.valueOf(unique.charAt(i));
            charactersWithFrequencies[i][0]= c;
            int v= c.charAt(0);
            charactersWithFrequencies[i][1]= String.valueOf(frequencyArray[v]);
        }
        return charactersWithFrequencies;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String string1=sc.nextLine();
        string1= string1.toLowerCase();
        String[][] array= frequencyOfCharacters(string1);
        for(String[] pair: array){
            System.out.println(pair[0]+" "+pair[1]);
        }
    }
}
