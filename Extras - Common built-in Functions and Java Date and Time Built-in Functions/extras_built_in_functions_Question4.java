import java.util.*;
public class extras_built_in_functions_Question4 {
    public static void fibbonacciGenerator(int firstNumber, int secondNumber, int length){
        int a=firstNumber;
        System.out.println(a);
        int b=secondNumber;
        System.out.println(b);

        for(int i=0; i<length; i++){
            int c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int firstNumber= sc.nextInt();
        System.out.println("Enter the second number");
        int secondNumber= sc.nextInt();
        System.out.println("Enter the length of the fibbonacci series");
        int length=sc.nextInt();
        fibbonacciGenerator(firstNumber,secondNumber,length);
    }
}
