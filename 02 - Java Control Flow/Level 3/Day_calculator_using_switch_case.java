import java.lang.*;
import java.util.Scanner;
public class Day_calculator_using_switch_case{
	public static void main(String[] args)
	{
		int m,d,y, y0,x,m0,d0;
		
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Date");
		d=s.nextInt();
		System.out.println("Enter Month");
		m=s.nextInt();
		System.out.println("Enter year");
		y=s.nextInt();
		
		y0 = y - (14 - m) / 12;
        x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
        m0 = m + 12 * ((14 - m) / 12) - 2;
        d0 = (d + x + (31 * m0) / 12) % 7;
		
		
		switch (d0){
			case 0:
				System.out.println("Its a sunday");
				break;
			case 1:
				System.out.println("Its a monday");
				break;
			case 2:
				System.out.println("Its a tuesday");
				break;
			case 3:
				System.out.println("Its a wednesday");
				break;
			case 4:
				System.out.println("Its a thursday");
				break;
			case 5:
				System.out.println("Its a friday");
				break;
			case 6:
				System.out.println("Its a saturday");
				break;
			default:
				System.out.println("invalid input");
				break;
		}
	}
}