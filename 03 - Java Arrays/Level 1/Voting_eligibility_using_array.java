import java.lang.*;
import java.util.*;
public class Voting_eligibility_using_array{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] agesArray =new int[10];
		String[] namesArray = new String[10];
		for (int i=0; i<10; i++){
			System.out.print("Enter the name of student " + (i+1) + ": ");
			namesArray[i]=sc.nextLine();
		}
			
			
		for(int i =0; i<10; i++){
			System.out.print("Enter the age of " + namesArray[i] + ": ");
			agesArray[i]=sc.nextInt();
		}
		for(int i=0; i<10;i++)
			if(agesArray[i]>=18){
				System.out.println(namesArray[i]+" is eligible to vote");
			}
			else{
				System.out.println(namesArray[i]+" is not eligible to vote");
			}
	}
}
				