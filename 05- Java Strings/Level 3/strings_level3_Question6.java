import java.util.*;
public class strings_level3_Question6{
    public static String[] frequencyOfCharacters(String string1){
       char[] characterArray=string1.toCharArray();
       int[] frequencyArray=new int[characterArray.length];
       int size=0;
       for(int i=0; i<characterArray.length; i++){
           char c=characterArray[i];
           if(c=='0'){
               continue;
           }
           frequencyArray[i]=1;
           for(int j=i+1; j<characterArray.length; j++){
               if(c== characterArray[j] && c != 0){
                   frequencyArray[i]++;
                   characterArray[j]='0';
               }
           }
           size++;
       }
       int index=0;
       String[] result= new String[size];
       for(int i=0; i<characterArray.length; i++) {
           if (characterArray[i] != '0') {
               result[index++] = characterArray[i] + " - " + frequencyArray[i];
           }
       }
       return result;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String string1=sc.nextLine();
        String[] result=frequencyOfCharacters(string1);
        for(int i=0; i< result.length; i++ ){
            System.out.println(result[i]);
        }
    }
}