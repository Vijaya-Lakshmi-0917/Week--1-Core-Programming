import java.util.*;
public class methods_level2_Question4 {
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371 * km;
        return km2miles;
    }
    public static double convertmiles2km(double miles) {
        double miles2km = 1.60934*miles;
        return miles2km;
    }
    public static double convertmeters2feet(double meters) {
        double meters2feet = 3.28084*meters;
        return meters2feet;
    }
    public static double convertfeet2meters(double feet) {
        double feet2meters = 0.3048*feet;
        return feet2meters;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance in km");
        double km=sc.nextDouble();
        System.out.println("Enter the distance in miles");
        double miles=sc.nextDouble();
        System.out.println("Enter the distance in meters");
        double meters=sc.nextDouble();
        System.out.println("Enter the distance in feet");
        double feet=sc.nextDouble();

        System.out.println(km+" km is "+convertKmToMiles(km)+" is miles" );
        System.out.println(miles+" miles is "+convertmiles2km(miles)+" is km" );
        System.out.println(meters+" meters is "+convertmeters2feet(meters)+" is feet" );
        System.out.println(feet+" feet is "+convertfeet2meters(feet)+" is meters" );


    }
}
