import java.util.*;
public class extras_built_in_functions_Questions9 {
    public static void addition(double number1, double number2){
        System.out.println(number1+number2);
    }
    public static void subtraction(double number1, double number2){
        System.out.println(number1-number2);
    }
    public static void mutiplication(double number1, double number2){
        System.out.println(number1*number2);
    }
    public static void division(double number1, double number2){
        System.out.println(number1/number2);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");
        double number1= sc.nextDouble();
        System.out.println("Enter the second number");
        double number2= sc.nextDouble();
        System.out.println("Enter + for additon, - for subtraction, * for multiplication and / for division");
        String string= sc.next();
        string=string.trim();
        if (string.equals("+")){
            addition( number1, number2);
        }
        else if (string.equals("-")){
            subtraction( number1, number2);
        }
        else if (string.equals("*")){
            mutiplication( number1, number2);
        }
        else if (string.equals("/")){
            division( number1, number2);
        }
    }
}
