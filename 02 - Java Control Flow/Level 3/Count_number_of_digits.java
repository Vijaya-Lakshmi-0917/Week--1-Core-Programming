import java.lang.*;
import java.util.*;
public class Count_number_of_digits_in_an_integer {
	public static void main(String[] args) {
		int count = 0, number;
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		while (number != 0) {
			number /= 10;
			++count;
    }
	System.out.println("Number of digits: " + count);
  }
}