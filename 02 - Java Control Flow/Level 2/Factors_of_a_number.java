import java.lang.*;
import java.util.*;
public class Factors_of_a_number{
	public static void main(String[] args){
		int number, i;
		i=1;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		number=sc.nextInt();
		System.out.println("Factors of "+number+" are:");
		for(i=1;i<=number; ++i){
			if (number%i==0){
			System.out.println(i+ " ");
			}
		}
	}
}