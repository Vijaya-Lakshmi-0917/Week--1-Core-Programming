import java.lang.*;
import java.util.*;
public class Voting_Eligibility{
	public static void main(String[] args){
		double age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		age=sc.nextDouble();
		if (age >= 18){
		    System.out.println("The person can vote.");
		}
		else{
			System.out.println("The person cannot vote." );
		}
	}
}