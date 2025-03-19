import java.lang.*;
import java.util.*;
public class Factorial_using_for_loop{
	public static void main(String[] args){
		int number,factorial,i;
		factorial=1;
		Scanner sc =new Scanner(System.in);
		number=sc.nextInt();
		for(i=1;i<number;i++){
			factorial=factorial*i;
		}
		System.out.println("The factorial is:"+factorial);
	}
}