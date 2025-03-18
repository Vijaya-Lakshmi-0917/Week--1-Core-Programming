import java.lang.*;
import java.util.*;
public class Simple_Interest{
	public static void main(String[] args)
	{
		double simple_interest, principal, rate, time;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principal");
		principal= sc.nextDouble();
		System.out.println("Enter the rate of interest");
		rate= sc.nextDouble();
		System.out.println("Enter the time period");
		time= sc.nextDouble();
		simple_interest= ((principal*rate*time)/100);
		System.out.println("The Simple Interest is " + simple_interest + "for Principal " + principal+", Rate of Interest "+ rate+" and Time "+ time);
	}
}
		
		