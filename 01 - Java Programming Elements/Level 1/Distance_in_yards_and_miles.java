import java.lang.*;
import java.util.*;
public class Distsnce_in_yards_and_miles{
	public static void main(String[] args){
		double feet, yard, miles;
		Scanner sc=new Scanner(System.in);
		feet=sc.nextDouble();
		yard=feet/3;
		miles=yard/1760;
		System.out.println("Distance in feet is "+feet+ " while in yard is " +yard+" and miles is " + miles);
	}
}
