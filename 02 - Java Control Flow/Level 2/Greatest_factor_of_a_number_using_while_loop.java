import java.lang.*;
import java.util.*;
public class Greatest_factor_of_a_number_using_while_loop{
	public static void main(String[] args){
		int number, i,factor;
		factor=1;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		number=sc.nextInt();
		i=number-1;
		System.out.println("Factors of "+number+" are:");
		while(i>=1){
			if (number%i==0){
			factor=i;
			break;
			}
		i--;
		}
		System.out.println(factor+ " ");
	}
}