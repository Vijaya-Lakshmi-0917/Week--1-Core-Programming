import java.lang.*;
import java.util.*;
public class Divisibility{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		double number = sc.nextDouble();
		if(number%5==0){
			System.out.println("The number "+ number +" is divisible by");
		}
		else{
			System.out.println("The number "+ number +" is not divisible by");
		}
	}
}