import java.util.*;
public class extras_built_in_functions_Question6 {
    public static int factorialUsingRecursion(int number){
        if(number>=1) {
            return number * factorialUsingRecursion(number - 1);
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(factorialUsingRecursion(number));
    }
}