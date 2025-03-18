import java.lang.*;
import java.util.*;
public class volume_of_earth{
	public static void main(String[] args){
		double r=6378;
		double volumeinkm= (4/3*3.14*r*r*r);
		double volumeinmile=volumeinkm/1.6;
		System.out.println("The volume of earth in cubic kilometers is "+ volumeinkm+" and cubic miles is "+volumeinmile);
	}
}