import java.lang.*;
import java.util.*;
public class BMI{
	public static void main(String[] args)
	{
		double height_in_cm, weight_in_kg, height_in_m, bmi; 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter height");
		height_in_cm=sc.nextDouble();
		System.out.println("Enter weight");
		weight_in_kg=sc.nextDouble();
		height_in_m= height_in_cm/100;
		
		bmi=weight_in_kg/(height_in_m*height_in_m);
		
		if(bmi<= 18.5){
			System.out.println("Under weight");
		}
		else if(bmi>=18.5 && bmi<=24.9){
			System.out.println("Normal");
		}
		else if(bmi>=25 && bmi<=39.9){
			System.out.println("Overweight");
		}
		else{
			System.out.println("Obese");
		}
	}
}
		
		
		