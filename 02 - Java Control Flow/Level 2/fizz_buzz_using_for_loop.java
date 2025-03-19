import java.lang.*;
import java.util.*;
public class fizz_buzz_using_for_loop{
	public static void main(String[] args){
		int n, i;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		n=sc.nextInt();
		for (i=1; i<=n; i++){
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
			}
		}
	}
}
