import java.lang.*;
import java.util.*;
public class Greatest_factor_of_a_number_using_for_loop{
	public static void main(String[] args){
		int number, i,factor;
		factor=0;
		i=1;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		number=sc.nextInt();
		System.out.println("Factors of "+number+" are:");
		for(i=1;i<number; ++i){
			if (number%i==0){
			factor=i;
			}
		}
		System.out.println(factor+ " ");
	}
}