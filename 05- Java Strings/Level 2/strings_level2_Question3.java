import java.util.*;
public class strings_level2_Question3 {
    public static int countOfTheWords(String string1){
        int count=1;
        for(int i=0; i< string1.trim().length(); i++){
            char c = string1.trim().charAt(i);
            if (c==' ' ){
                count++;
            }
        }
        return count;
    }
    public static String[] extractingWordsFromString(String string1, int count, int length){
        StringBuilder currentWord= new StringBuilder();
        int index=0;
        String[] wordsArray= new String[count];
        for(int i=0; i<length; i++){
            char c=string1.charAt(i);
            if (c != ' '){
                currentWord.append(c);
            }
            else {
                wordsArray[index++]=currentWord.toString();
                currentWord.setLength(0);
            }
        }
        if (currentWord.length()>0){
            wordsArray[index]=currentWord.toString();
        }
        return wordsArray;
    }
    public static int lengthOfTheString(String string1){
        int count=0;
        int i=0;
        while(true){
            try{
                string1.trim().charAt(i);
                count++;
            }
            catch (Exception e){
                return count;
            }
            i++;
        }
    }
    public static String[][] wordsAndLength(String [] wordsArray, int count){
        String[][] wordsAndLengthArray= new String[count][2];
        for(int i=0; i<count; i++){
            wordsAndLengthArray[i][0]=wordsArray[i];
            wordsAndLengthArray[i][1]=String.valueOf(wordsArray[i].length());
        }
        return wordsAndLengthArray;
    }

    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        String string1= sc.nextLine();
        int count = countOfTheWords(string1);
        int length=lengthOfTheString(string1);
        String [] wordsArray =extractingWordsFromString(string1,count,length );
        System.out.println("The length of the string is: "+length);
        String[][] wordsAndLengthArray=wordsAndLength(wordsArray,count);
        System.out.printf(" %11s\t %5s\n","Words" ,"count");
        for (int i=0; i<count ; i++){
            System.out.printf(" %10s\t %5d\n",wordsAndLengthArray[i][0],Integer.parseInt(wordsAndLengthArray[i][1]));
        }
    }
}
