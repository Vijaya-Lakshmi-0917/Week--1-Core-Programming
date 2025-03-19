import java.lang.*;
import java.util.*;
public class multiplication_table_from_6_to_9{
	public static void main(String[] args){
		int number, n, i;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		number=sc.nextInt();
		System.out.println("Enter number of times");
		n=sc.nextInt();
		for (i=1; i<=n; i++){
			System.out.println(number + " * "+i+"="+number*i);
		}
	}
}
