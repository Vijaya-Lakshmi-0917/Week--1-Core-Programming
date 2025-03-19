import java.lang.*;
import java.util.*;
public class Armstrong_number {
	public static void main(String[] args) {
		int number , input_number, remainder, sum = 0, n = 0;
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		input_number = number;
		for (;input_number != 0; input_number /= 10, ++n);
		input_number = number;

        for (;input_number != 0; input_number /= 10)
        {
            remainder = input_number % 10;
            sum += Math.pow(remainder, n);
        }

        if(sum == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}