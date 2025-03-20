import java.lang.*;
import java.util.*;
public class Mean_heights_of_players_in_football_team_using_arrays{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double[] Heights =new double[11];
		double count=0, mean;
		
			
		for(int i =0; i<11; i++){
			System.out.println("Enter the height of player "+ (i+1)+ " in cm");
			Heights[i]=sc.nextDouble();
		}
		for(int i =0; i<11; i++){
			count=count+Heights[i];
		}
		mean=count/11;
		System.out.println(mean+" is the mean height of the players.");

	}
}