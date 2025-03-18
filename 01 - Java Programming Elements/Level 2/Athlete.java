import java.lang.*;
import java.util.*;
public class Athlete{
	public static void main(String[] args){
		Double Side1, Side2, Side3, perimeter, Distance, Totalnumberofrounds;
		Scanner sc=new Scanner(System.in);
		Side1=sc.nextDouble();
		Side2=sc.nextDouble();
		Side3=sc.nextDouble();
		perimeter=(Side1+Side2+Side3)/1000;
		Distance= 5.0;
		Totalnumberofrounds=Distance/perimeter;
		System.out.println("The total number of rounds the athlete will run is " + Totalnumberofrounds + " to complete 5 km");
	}
}
		
		
		
		
		