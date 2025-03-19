import java.lang.*;
import java.util.*;
public class multiples_of_a_number_taken_as_user_input_below_100{
	public static void main(String[] args){
		int number, i;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		number=sc.nextInt();
		if(number<0 && number>100){
			System.out.println("number not valid");
			}
		else{
			for(i=100;i>=1; i--)
			{
				if (number%i==0)
				{
				System.out.println(i);
				continue;
				}
			}
		}
	}
}