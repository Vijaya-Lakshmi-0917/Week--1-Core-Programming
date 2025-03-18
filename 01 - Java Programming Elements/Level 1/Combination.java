import java.lang.*;
import java.util.*;
public class Combination{
	public static void main(String[] args){
	double numberofstudents, combinationofhandshakes;
	Scanner sc=new Scanner(System.in);
	numberofstudents=sc.nextDouble();
	combinationofhandshakes=(numberofstudents * (numberofstudents - 1)) / 2 ;
	System.out.println("The number of possible hand shakes are: " + combinationofhandshakes );
	}
}
	
	
