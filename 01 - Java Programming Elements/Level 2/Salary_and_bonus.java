import java.lang.*;
import java.util.*;
public class Salary_and_bonus{
	public static void main(String[] args){
		double salary, bonus, total_income;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Salary");
		salary=sc.nextDouble();
		System.out.println("Enter bonus");
		bonus=sc.nextDouble();
		total_income=salary+bonus;
		System.out.println("The salary is INR "+ salary +" and bonus is INR "+ bonus +". Hence Total Income is INR " +total_income);
	}
}
		