import java.lang.*;
import java.util.*;
public class Quotient_and_Remainder{
	public static void main(String[] args){
		double a, b, quotient, remainder;
		Scanner sc= new Scanner(System.in);
		a =sc.nextDouble();
		b=sc.nextDouble();
		quotient= a/b;
		remainder=a%b;
		System.out.println("The quotient is:"+ quotient);
		System.out.println("The remainder is:"+ remainder);
	}
}
		
		