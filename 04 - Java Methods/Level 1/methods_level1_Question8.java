import java.util.*;
public class methods_level1_Question8 {
    static int[] findSmallestAndLargest(int number1,int number2, int number3) {
        int largestNumber = 0;
        int smallestNumber = 0;
        int[] result=new int[2];
        if (number1 >number2 && number1 > number3)
        {
            result[0]=number1;
        }
        else if (number2>number1 && number2>number3){
            result[0]=number2;
        }
        else {
            result[0]=number3;
        }
        if (number1 <number2 && number1 <number3)
        {
            result[1]=number1;
        }
        else if (number2<number1 && number2<number3){
            result[1]=number2;
        }
        else {
            result[1]=number3;
        }

        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1=sc.nextInt();
        System.out.println("Enter the second number");
        int number2=sc.nextInt();
        System.out.println("Enter the third number");
        int number3=sc.nextInt();
        int[] result= findSmallestAndLargest(number1,number2,number3);
        System.out.println("the largest number is: "+result[0]);
        System.out.println("the smallest number is: "+result[1]);
    }
    }
