import java.lang.*;
import java.util.*;
public class Travelcomputation{
	public static void main(String[] args){ 
		Scanner sc= new Scanner(System.in);
		String name= sc.nextLine();
		String fromCity= sc.nextLine();
		String viaCity= sc.nextLine();
		String toCity= sc.nextLine();
		double distancefromtovia=sc.nextDouble();
		double distanceviatofinalcity=sc.nextDouble();
      	int timefromtovia=sc.nextInt();
		int timefromviatofinalcity=sc.nextInt();
		int totalTime= timefromtovia+timefromviatofinalcity;
		double totalDistance= distancefromtovia+distanceviatofinalcity;
		System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity +" is " + totalDistance + " km and " +"the Total Time taken is " + totalTime + " minutes");
	}
}
		
		
		
