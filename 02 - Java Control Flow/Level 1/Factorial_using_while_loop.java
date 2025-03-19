import java.lang.*;
import java.util.*;
public class Factorial_using_while_loop{
	public static void main(String[] args){
		int number,factorial,i;
		i=1;
		factorial=1;
		Scanner sc =new Scanner(System.in);
		number=sc.nextInt();
		while(i<number){
			factorial=factorial*i;
			i++;
		}
		System.out.println("The factorial is:"+factorial);
	}
}