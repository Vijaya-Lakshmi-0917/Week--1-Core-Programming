import java.lang.*;
import java.util.*;
public class Factors_of_7{
	public static void main(String[] args){
		int number, i;
		i=1;
		number=7;
		System.out.println("Factors of "+number+" are:");
		while(i<=number){
			if (number%i==0){
			System.out.println(i);
			}
		i++;
		}
	}
}