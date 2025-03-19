import java.lang.*;
import java.util.*;
public class fizz_buzz_using_while_loop{
	public static void main(String[] args){
		int n, i;
		i=1;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		n=sc.nextInt();
		while(i=<n){
			if (i%3==0){
			System.out.println("Fizz");
			}
			else if (i%5==0){
				System.out.println("Buzz");
			}
			else if (i%3==0 && i%5==0){
				System.out.println("FizzBuzz");
			}
			else {
				System.out.println(i);
			i++;
			}
		}
	}
}