import java.lang.*;
import java.util.*;
public class pen_distribution{
	public static void main(String[] args){
		int pen, student, pensperstudent, remainingpens;
		Scanner sc= new Scanner(System.in);
		pen=14;
		student=3;
		pensperstudent=pen/student;
		remainingpens=pen%student;
		System.out.println("The Pen Per Student is "+pensperstudent +" and the remaining pen not distributed is " +remainingpens);
	}
}