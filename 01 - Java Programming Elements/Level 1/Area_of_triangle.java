import java.lang.*;
import java.util.*;
public class Area_of_triangle{
	public static void main(String[] args){
		double base,height, area_in_cm, feet, inch;
		Scanner sc=new Scanner(System.in);
		base=sc.nextDouble();
		height=sc.nextFloat();
		area_in_cm=0.5*base*height;
		inch=area_in_cm/2.54;
		feet=inch/12;
		System.out.println("area in cm is"+area_in_cm+ "while in feet is " +feet+ "and inches is"+inch);
	}
}
		
