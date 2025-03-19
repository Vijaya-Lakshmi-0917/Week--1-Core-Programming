import java.lang.*;
import java.util.*;
public class Spring_Season{
	public static void main(String[] args){
		int month, date;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the month");
		month=sc.nextInt();
		System.out.println("Enter the day");
		date=sc.nextInt();
	    if ((month==3 && date >=20)||(month==6 && date<=20)||month==4||month==5){
			System.out.println("Its a Spring Season");
		}
		else {
			System.out.println("Its not a Spring Season");
		}
	}
}
		
		
