import java.lang.*;
import java.util.*;
public class Farenheit_to_celsius{
    public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	float celsius, farenheit;
	System.out.println("Enter the required number");
	farenheit=sc.nextFloat();
	celsius= (farenheit-32)*5/9;
	System.out.println("The "+farenheit + " farenheit is "+celsius+ " Celsius");
	}
}