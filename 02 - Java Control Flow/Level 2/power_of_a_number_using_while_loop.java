import java.lang.*;
import java.util.*;
public class power_of_a_number_using_while_loop{
	public static void main(String[] args){
		int number, power;
		long result=1;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		number=sc.nextInt();
		System.out.println("Enter power");
		power=sc.nextInt();
			while(power!=0 ){
				result=result*number;
				--power;
			}
		System.out.println("The result is "+result);
	}
}