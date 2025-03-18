import java.lang.*;
import java.util.*;
public class Total_purchase{
	public static void main(String[] args){
	double unitprice, quantity, total_price;
	Scanner sc= new Scanner(System.in);
	unitprice=sc.nextDouble();
	quantity=sc.nextDouble();
	total_price=unitprice*quantity;
	System.out.println("The total purchase price is INR "+ total_price+" if the quantity "+quantity+ " and unit price is INR "+unitprice);
	}
}