import java.lang.*;
import java.util.*;
public class Positive_negative_or_zero{
	public static void main(String[] orgs){
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		Double number= sc.nextDouble();
		if (number >0){
			System.out.println("Positive");
		}
		else if (number< 0){
			System.out.println("Negative");
		}
		else {
			System.out.println("Zero");
		}
	}
}
			
		
		
