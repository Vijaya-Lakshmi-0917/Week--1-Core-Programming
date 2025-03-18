import java.lang.*;
import java.util.*;
public class Double_Operations{
	public static void main(String[] args){
		double a, b, c, op1, op2, op3, op4;
		Scanner sc= new Scanner(System.in);
		a= sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		op1= a + b *c;
		op2=a * b + c;
		op3=c + a / b;
		op4=a % b + c;
		System.out.println("First operation: "+op1);
		System.out.println("Second operation: "+op2);
		System.out.println("Third operation: "+op3);
		System.out.println("Fourth operation: "+op4);
	}
}