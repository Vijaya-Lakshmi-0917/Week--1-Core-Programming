import java.lang.*;
import java.util.*;
public class Amar_Akbar_Anthony{
    public static void main(String[] args){
		Double age_of_akbar, age_of_amar, age_of_anthony, height_of_akbar,height_of_amar, height_of_anthony;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the height of amar");
		height_of_amar=sc.nextDouble();
		System.out.println("Enter the height of akbar");
		height_of_akbar=sc.nextDouble();
		System.out.println("Enter the height of anthony");
		height_of_anthony=sc.nextDouble();
		System.out.println("Enter the age of amar");
		age_of_amar=sc.nextDouble();
		System.out.println("Enter the age of akbar");
		age_of_akbar=sc.nextDouble();
		System.out.println("Enter the age of anthony");
		age_of_anthony=sc.nextDouble();
		if (height_of_amar >height_of_akbar && height_of_amar > height_of_anthony)
		{
			System.out.println("Amar is the tallest");
		}
		else if (height_of_akbar>height_of_amar && height_of_akbar>height_of_anthony){
			System.out.println("Akbar is the tallest");
		}
		else{
			System.out.println("Anthony is the tallest");
		}
		if (age_of_amar <age_of_akbar && age_of_amar < age_of_anthony)
		{
			System.out.println("Amar is the youngest");
		}
		else if (age_of_akbar<height_of_amar && age_of_akbar<height_of_anthony){
			System.out.println("Akbar is the youngest");
		}
		else{
			System.out.println("Anthony is the youngest");
		}
	}
}