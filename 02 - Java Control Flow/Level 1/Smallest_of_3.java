import java.lang.*;
import java.util.*;
public class Smallest_of_3{
	public static void main(String[] args){
		Double number1, number2, number3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		number1=sc.nextDouble();
		System.out.println("Enter the second number");
		number2=sc.nextDouble();
		System.out.println("Enter the third number");
		number3=sc.nextDouble();
		if (number1>number2 && number1>number3){
			System.out.println(number1 +" is the largest number ");
		}
		else{
			System.out.println(number1 + " is not the largest number");
		}
	}
}
			
			
		
		