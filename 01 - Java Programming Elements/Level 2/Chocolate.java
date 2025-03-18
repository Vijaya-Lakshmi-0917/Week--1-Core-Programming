import java.lang.*;
import java.util.*;
public class Chocolate{
	public static void main(String[] args){
		double numberOfChocolates, numberOfChilden, numberOfChocotestoeach, leftoutChocolates;
		Scanner sc= new Scanner(System.in);
		numberOfChocolates=sc.nextDouble();
		numberOfChilden=sc.nextDouble();
		numberOfChocotestoeach= numberOfChocolates/numberOfChilden;
		leftoutChocolates=numberOfChocolates%numberOfChilden;
		System.out.println("The number of chocolates each child gets is "+numberOfChocotestoeach+" and the number of remaining chocolates are "+leftoutChocolates);
	}
}