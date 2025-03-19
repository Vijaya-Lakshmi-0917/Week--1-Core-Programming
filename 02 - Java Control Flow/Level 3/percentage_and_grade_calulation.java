import java.lang.*;
import java.util.*;
public class percentage_and_grade_calulation{
	public static void main(String[] args){
		double physics, chemistry, maths, percentage, average;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter physics marks");
		physics=sc.nextDouble();
		System.out.println("Enter chemistry marks");
		chemistry=sc.nextDouble();
		System.out.println("Enter maths marks");
		maths=sc.nextDouble();
		average=(physics + chemistry+maths)/3;
		percentage=((physics + chemistry+maths)/300)*100;
		System.out.println("The average is: "+average);
		System.out.println("percentage is: "+percentage);
		if (percentage>=80)
		{
			System.out.println("grade A");
			System.out.println("Level 4, above agency-normalized standards");
		}
		else if (percentage>=70)
		{
			System.out.println("grade B");
		    System.out.println("Level 3, at agency-normalized standards"); 
		}
		else if(percentage>=60)
		{
			System.out.println("grade C");
			System.out.println("Level 2, below, but approaching agency-normalized standards");
		}
		else if (percentage>50)
		{
			System.out.println("grade D");
			System.out.println("Level 1, well below agency-normalized standards");
		}
		else if (percentage>40)
		{
			System.out.println("grade E");
			System.out.println("Level 1-, too below agency-normalized standards");
		}
		else
		{
			System.out.println("grade R");
			System.out.println("Remedial standards");
		}
	}
}