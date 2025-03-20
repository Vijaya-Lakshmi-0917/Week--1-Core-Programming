import java.lang.*;
import java.util.*;
public class multiplication_calculator_using_an_array{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int[] multiplicationResult= new int[10];
		if (number>=6 && number<=9){
			for (int i=0; i<10;i++){
				multiplicationResult[i]=(i+1)*number;
				System.out.println(number +" * "+ (i+1) +" = "+ multiplicationResult[i] );
			}
		}
		else{
			System.out.println("Invalid input" );
			}
	}
}