import java.lang.*;
import java.util.*;
public class leap_year_with_if_else{
	public static void main(String[] args){
		int year;
		boolean is_leap_year = false;
		Scanner sc= new Scanner(System.in);
		year=sc.nextInt();
		if (year % 4 == 0) {
			is_leap_year = true;
				if (year % 100 == 0) {
					if (year % 400 == 0){
						is_leap_year = true;
					}
				
					else{
						is_leap_year = false;
					}
					
				}
		}
 
		else{
			is_leap_year = false;
		}
 
		if (!is_leap_year){
			System.out.println("not a leap year");
		}
		else{
			System.out.println("its a leap year");
		}
	}
}	
			