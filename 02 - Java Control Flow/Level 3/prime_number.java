import java.lang.*;
import java.util.*;
public class prime_number{
	public static void main(String[] args){
		int number;
		int i;
		boolean n=false;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		number=sc.nextInt();
		if (number==0 || number==1){
			n=true;
		}
		for (i =2; i<number;i++);{
			if (number%i==0){
				n=true;
				break;
			}
		}
		if(!n){
			System.out.println("The number is a prime number");
		}
		else{
			System.out.println("The number is not a prime number");
			}
	}
}
			
			
		