import java.util.*;
public class extras_built_in_functions_Question3 {
    public static boolean isPrime(int number1){
        int count=0;
        for(int i=1; i<number1; i++) {
            if (number1 % i == 0) {
                count++;
            }
        }
        if (count>1){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number1= sc.nextInt();
        System.out.println(isPrime(number1));
        }
    }
