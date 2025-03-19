import java.lang.*;
import java.util.*;
public class Harshad_number{
	public static void main(String[] args)
	{
		int number;
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();

		int n= number;

		int sum = 0;
		while(number > 0)
		{
			int rem = number%10;
			sum = sum + rem;
			number = number/10;
		}

		if(n % sum == 0)
		{
			System.out.println("Harshad number");
		}
		else
		{
			System.out.println("Not a Harshad number");
		}
	}
}