import java.lang.*;
import java.util.*;
public class Factors_of_a_number_using_arrays{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int maxFactor=10;
		int factorsCount=0;
		int[] Factors= new int[maxFactor];
		
		int index=0;
		for(int i=1;i<number;i++){
			if(number%i==0){
				if (maxFactor==index){
					maxFactor=maxFactor*2;
					int temp[]=new int[maxFactor];
					System.arraycopy(Factors, 0, maxFactor,0,Factors.length);
					Factors=temp;
				}
				Factors[index]=i;
				index++;
			}
		}
		System.out.println("The factors of "+ maxFactor+ " are:");
		for (int i=0; i<index;i++){
			System.out.println(Factors[i]);
		}
	}
}
		
			
			
		