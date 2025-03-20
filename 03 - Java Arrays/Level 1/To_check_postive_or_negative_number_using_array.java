import java.lang.*;
import java.util.*;
public class To_check_postive_or_negative_number_using_array{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] numArray =new int[5];
		for(int i =0; i<5; i++){
			System.out.print("Enter the number: ");
			numArray[i]=sc.nextInt();
		}
		for(int i=0; i<5;i++){
			if(numArray[i]>0){
				System.out.println(numArray[i]+" is a positive number");
			}
			else if(numArray[i]<0){
				System.out.println(numArray[i]+" is a negative number");
				}
			else{
				System.out.println("it is zero");
			}
		}
		if (numArray[0]>numArray[4]){
			System.out.println(numArray[0]+" is greater than "+numArray[4]);
		}
		else if(numArray[0]<numArray[4]){
			System.out.println(numArray[0]+" is lesser than "+numArray[4]);
		}
		else{
			System.out.println("Both the numbers are equal");
		}
			
			
		
	}
}
