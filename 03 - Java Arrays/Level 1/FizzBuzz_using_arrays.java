import java.lang.*;
import java.util.*;
public class FizzBuzz_using_arrays {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int number =sc.nextInt();
        String[] stringArray= new String[number];
        if (number<=0) {
            System.out.println("Invalid input");
        }
        else{
            int index=0;
            for(int i=0; i<number ; i++ ){
                if (i%3==0 && i%5==0) {
                    stringArray[index] = "fizzBuzz";
                }
                else if (i%5==0) {
                    stringArray[index] = "buzz";
                }
                else if (i%3==0) {
                    stringArray[index] = "fizz";
                }
                else{
                    stringArray[index]=Integer.toString(i);
                }
                index++;

            }
            index++;
            for (int j=0; j<number;j++) {
                System.out.println(stringArray[j]);
            }
        }
    }
}