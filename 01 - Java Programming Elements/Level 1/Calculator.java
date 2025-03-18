import java.lang.*;
import java.util.*;
public class Calculator{
	public static void main(String[] args){
		float number1,number2,addition, subtraction, multiplication, division;
		Scanner sc= new Scanner(System.in);
		number1=sc.nextFloat();
		number2=sc.nextFloat();
		addition=number1+number2;
		subtraction=number1-number2;
		multiplication=number1*number2;
		division=number1/number2;
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+number1+" and "+number2+ " is "  +addition+", "+subtraction+"," +multiplication+", and "+division);	}
}