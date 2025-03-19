import java.lang.*;
import java.util.*;
public class Natural_number{
	public static void main(String[] args){
		double number, sum_of_natural_numbers;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		number=sc.nextDouble();
		if (number >= 0){
			sum_of_natural_numbers= number*(number+1)/2;
		    System.out.println("The sum of natural numbers is "+sum_of_natural_numbers);
		}
		else{
			System.out.println("The number" + number+" is not a natural number" );
		}
	}
}
			

			

			
		
		
		