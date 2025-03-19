import java.lang.*;
import java.util.*;
public class Sum_of_numbers_using_while_loop_until_user_enters_zero{
	public static void main(String[] args){
		double input_number;
		double total=0.0;
		Scanner sc =new Scanner(System.in);
		input_number=sc.nextDouble();
		while (input_number!=0){
			total=total+input_number;
		    System.out.println("please enter the value again");
		    input_number=sc.nextDouble();
			
			System.out.println("total is "+total);
		}
	}
}
			
			
		
		
		
		