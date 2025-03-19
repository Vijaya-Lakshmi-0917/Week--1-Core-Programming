import java.lang.*;
import java.util.*;
public class Zara_salary_and_bonus{
	public static void main(String[] args){
		double salary,years;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter salary");
		salary=sc.nextDouble();
		System.out.println("Enter number of years");
		years=sc.nextDouble();
		    if (years>5){
			salary=salary+(salary*5/100);
			System.out.println(salary+" Salary plus bonus");
			}
			else {
		    System.out.println(salary+" only salary");
			}
			
	}
}