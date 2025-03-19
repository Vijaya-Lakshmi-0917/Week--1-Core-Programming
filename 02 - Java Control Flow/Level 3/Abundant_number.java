import java.lang.*;
import java.util.*;
public class Abundant_number{
	public static void main(String[] args){
		int number, sum;
		sum=0;
		Scanner sc= new Scanner(System.in);
		number= sc.nextInt();
		for (int i =1; i<number; i++)
		{
			if (number%i==0){
				sum=sum+i;
			}
		}
			if (sum>number)
			{
				System.out.println("Abundant number");
			}
			else{
				System.out.println("Not an abundant number");
			}
	}
}
		