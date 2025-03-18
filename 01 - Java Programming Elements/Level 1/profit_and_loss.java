import java.lang.*;
import java.util.*;
public class profit_and_loss{
    public static void main(String[] args){
		double selling_price, cost_price, profit, profit_percentage; 
		selling_price=191;
		cost_price=129;
		profit = selling_price - cost_price;
		profit_percentage= (profit/cost_price)*100;
		System.out.println("The Cost Price is INR "+ cost_price +" and Selling Price is INR " + selling_price +"\nThe Profit is INR " +profit+" and the Profit Percentage is " + profit_percentage);
	}
}