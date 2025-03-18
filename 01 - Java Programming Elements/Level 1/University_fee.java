import java.lang.*;
import java.util.*;
public class University_fee{
	public static void main(String[] args){
		int fee=125000;
		int discountPercent=10;
		double discount=fee*(100-discountPercent)/100;
		double discounted_fee= fee-discount;
		System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+discounted_fee);
	}
}
		