import java.lang.*;
import java.util.*;
public class Swap_numbers{
	public static void main(String[] args){
		Double number1, number2, temp;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the First number:");
		number1= sc.nextDouble();
		System.out.println("Enter the Second number:");
		number2= sc.nextDouble();
		temp=number1;
		number1=number2;
		number2=temp;
		System.out.println("The swapped numbers are "+ number1 +" and "+ number2);
	}
}
		