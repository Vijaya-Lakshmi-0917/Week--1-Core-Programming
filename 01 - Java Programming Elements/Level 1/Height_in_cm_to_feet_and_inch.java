import java.lang.*;
import java.util.*;
public class Height_in_cm_to_feet_and_inch{
	public static void main(String[] args){
		double height_in_cm, feet, inch;
		Scanner sc=new Scanner(System.in);
		height_in_cm=sc.nextDouble();
		inch=height_in_cm/2.54;
		feet=inch/12;
		System.out.println("Your Height in cm is "+height_in_cm+ " while in feet is "+feet+" and inches is "+inch);
	}
}
		
		