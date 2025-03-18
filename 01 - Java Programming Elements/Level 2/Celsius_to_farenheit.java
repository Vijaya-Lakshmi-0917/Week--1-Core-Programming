import java.lang.*;
import java.util.*;
public class Celcius_to_farenheit{
    public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	double celsius, farenheit;
	System.out.println("Enter the required number");
	celsius=sc.nextInt();
	farenheit= ((celsius * 9/5) + 32);
	System.out.println("The" + celsius + " Celsius is "+ farenheit+ " farenheit" );
	}
}