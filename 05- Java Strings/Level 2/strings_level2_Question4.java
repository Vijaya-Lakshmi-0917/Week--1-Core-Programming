import java.util.*;
public class strings_level2_Question4 {
    public static int lengthOfTheString(String string1) {
        int length = 0;
        int i = 0;
        while (true) {
            try {
                string1.trim().charAt(i);
                length++;
            } catch (Exception e) {
                return length;
            }
            i++;
        }
    }
    public static int countOfWords(String string1, int length) {
        int count = 1;
        for (int i = 0; i < length; i++) {
            char c = string1.charAt(i);
            if (c == ' ') {
                count++;
            }
        }
        return count;
    }
    public static String[] words(String string1, int length, int count) {
        String[] wordsArray = new String[count];
        int index = 0;
        StringBuilder currentWord = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c = string1.charAt(i);
            if (c != ' ') {
                currentWord.append(c);
            } else {
                wordsArray[index] = currentWord.toString();
                currentWord.setLength(0);
                index++;
            }
        }
        if (currentWord.length() > 0) {
            wordsArray[index] = currentWord.toString();
        }
        return wordsArray;
    }
    public static String [][] wordsAndLength(String[] wordsArray, int length, int count) {
        String[][] wordsAndLengthArray = new String[count][2];
        for (int i = 0; i < count; i++) {
            wordsAndLengthArray[i][0] = wordsArray[i];
            wordsAndLengthArray[i][1] = String.valueOf(wordsArray[i].length());
        }
        return wordsAndLengthArray;
    }
    public static String [] shortestAndLongestStrings(String[][] wordsAndLengthArray, int count){
        String [] shortestAndLongestStringsArray= new String[2];
        int longest =Integer.parseInt(wordsAndLengthArray[0][1]);
        int shortest=Integer.parseInt(wordsAndLengthArray[0][1]);
        String longestString= wordsAndLengthArray[0][0];
        String shortestString=wordsAndLengthArray[0][0];

        for (int i=0; i<count; i++) {
            if (Integer.parseInt(wordsAndLengthArray[i][1]) > longest){
                longest=Integer.parseInt(wordsAndLengthArray[i][1]);
            }
            if (Integer.parseInt(wordsAndLengthArray[i][1]) < longest){
                shortest=Integer.parseInt(wordsAndLengthArray[i][1]);
            }
        }
        for (int i=0; i< count; i++){
            if ((Integer.parseInt(wordsAndLengthArray[i][1]))== shortest){
                shortestAndLongestStringsArray[0]=wordsAndLengthArray[i][0];
            }
            if ((Integer.parseInt(wordsAndLengthArray[i][1]))== longest){
                shortestAndLongestStringsArray[1]=wordsAndLengthArray[i][0];
            }
        }
        return shortestAndLongestStringsArray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string1 = sc.nextLine();
        int length = lengthOfTheString(string1);
        int count= countOfWords(string1,length);
        String[] wordsArray=words(string1,length,count);
        String[][] wordsAndLengthArray  = wordsAndLength(wordsArray ,length,count);
        String [] shortestAndLongestStringsArray= shortestAndLongestStrings(wordsAndLengthArray, count);
        System.out.println("The shortest string is : "+ shortestAndLongestStringsArray[0]);
        System.out.println("The longest string is : "+ shortestAndLongestStringsArray[1]);
    }
}
