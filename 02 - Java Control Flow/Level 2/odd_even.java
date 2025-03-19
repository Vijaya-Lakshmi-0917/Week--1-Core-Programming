import java.lang.*;
import java.util.*;
public class odd_even{
	public static void main(String[] args){
		double number,i;
		Scanner sc =new Scanner(System.in);
		number=sc.nextDouble();
		for(i=1;i<number;i++){
		    if (i%2==0){
			System.out.println(i+" is even");
			}
			else {
		    System.out.println(i+" is odd");
			}
		}
			
	}
}