import java.lang.*;
import java.util.*;
public class Calculator_using_switch_case{
	public static void main(String[] args)
	{
		double first, second, result;
		char op;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number");
		first=sc.nextDouble();
		System.out.println("Enter Second");
		second=sc.nextDouble();
		System.out.println("Enter operation");
		op=sc.next().charAt(0);
		
		switch (op){
			case '+':
				result = first + second;
				System.out.println(result);
				break;
			case '-':
				result = first- second;
				System.out.println(result);
				break;
			case '*':
				result = first* second;
				System.out.println(result);
				break;
			case '/':
				result = first- second;
				System.out.println(result);
				break;
			default:
				System.out.println("invalid input");
				break;
		}
	}
}