import java.lang.*;
import java.util.*;
public class Odd_or_even_using_arrays{
	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		int number, n;
		System.out.println("Enter number ");
		number= sc.nextInt();
		int oddCount=0;
		int evenCount=0;
		if (number <=0){
			System.out.println("Invalid number ");
			System.exit(0);
		}
		for(int i =1; i<number; i++){
			if(i%2==0){
				oddCount=oddCount+1;
			}
			else{
				evenCount=evenCount+1;
			}
		}
		int[] oddArray=new int[oddCount];
		int[] evenArray=new int[evenCount];
		int oddIndex=0;
		int evenIndex=0;
		for(int i =1; i<number; i++){
			if(i%2==0){
				evenArray[evenIndex++]=i;
			}
			else{
				oddArray[oddIndex++]=i;
			}
		}
		System.out.println("Even Array elements");
		for (int i=0; i<evenArray.length;i++){
			System.out.println(evenArray[i]);
		}
		System.out.println("Odd Array elements");
		for (int i=0; i<oddArray.length;i++){
			System.out.println(oddArray[i]);
		}

	}
}