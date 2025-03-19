import java.lang.*;
import java.util.*;
public class Natural_number_using_for_loop{
	public static void main(String[] args){
		int n, sum_of_natural_number, count,i;
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		count=0;
		sum_of_natural_number=n*(n+1)/2;
	    for (i=1;i<=n;i++){
			count=count+i;
			}
		System.out.println("loop output"+count++);
		System.out.println("formula output"+sum_of_natural_number);
	}
}