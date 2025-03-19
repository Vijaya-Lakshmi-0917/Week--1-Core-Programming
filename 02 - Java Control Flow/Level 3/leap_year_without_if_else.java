import java.lang.*;
import java.util.*;
public class leap_year_without_if_else{
	public static void main(String[] args){
		int year;
		boolean isleapyear;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter year");
		year=sc.nextInt();
		if (((year % 4==0)&&(year%100!=0)) || (year%400==0)){
			System.out.println("its a leap year");
		}
	}
}
