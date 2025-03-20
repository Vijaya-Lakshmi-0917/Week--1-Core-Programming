import java.lang.*;
import java.util.*;
public class Calculator_using_an_array{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int[] numArray= new int[10];
		for (int i=0; i<10;i++){
			numArray[i]=(i+1)*number;
			System.out.println(i+1 +" * "+ number +" = "+ numArray[i] );
		}
	}
}
		
			