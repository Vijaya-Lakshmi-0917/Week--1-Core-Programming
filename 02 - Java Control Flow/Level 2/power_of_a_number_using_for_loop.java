import java.lang.*;
import java.util.*;
public class power_of_a_number_using_for_loop{
	public static void main(String[] args){
		int base, exponent;
		long result=1;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter base");
		base=sc.nextInt();
		System.out.println("Enter exponent");
		exponent=sc.nextInt();
			for(;exponent!=0; --exponent){
				result=result*base;
			}
		System.out.println("The result is "+result);
	}
}