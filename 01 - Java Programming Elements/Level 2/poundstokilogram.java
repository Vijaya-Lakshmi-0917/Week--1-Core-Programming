import java.lang.*;
import java.util.*;
public class poundstokilogram{
	public static void main(String[] args){
		double weight, pound, weightinkilograms;
		System.out.println("Enter the weight in pounds.");
		Scanner sc= new Scanner(System.in);
		weight=sc.nextDouble();
		pound=2.2;
		weightinkilograms=weight*pound;
		System.out.println(" The weight of the person in pound is weight and in kg is "+ weightinkilograms);
	}
}
		