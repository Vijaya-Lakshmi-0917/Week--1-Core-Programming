import java.lang.*;
import java.util.*;
public class Interger_Operations{
	public static void main(String[] args){
		int a, b, c, op1, op2, op3, op4;
		Scanner sc= new Scanner(System.in);
		a= sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
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