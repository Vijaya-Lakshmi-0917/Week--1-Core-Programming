import java.lang.*;
import java.util.*;
public class Rocket_Lauch_using_for_loop{
	public static void main(String[] args){
		int counter;
		Scanner sc=new Scanner(System.in);
		counter=sc.nextInt();
		for (int i =counter; counter>1; i++){
			counter--;
			System.out.println(counter);
		}
	}
}
