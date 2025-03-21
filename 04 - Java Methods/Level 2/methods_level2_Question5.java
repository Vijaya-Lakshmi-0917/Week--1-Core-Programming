import java.util.*;
public class methods_level2_Question5 {
    public static double convertYardsToFeet(double yards)  {
        double yards2feet = 3*yards;
        return yards2feet;
    }
    public static double convertFeetToYards(double feet)  {
        double feet2yards = 0.333333*feet;
        return feet2yards;
    }
    public static double convertMetersToInches(double meters)  {
        double meters2inches = 39.3701*meters;
        return meters2inches;
    }
    public static double convertInchesToMeters(double inches)  {
        double inches2meters = 0.0254*inches;
        return inches2meters;
    }
    public static double convertInchesToCm(double inches)  {
        double inches2cm = 2.54*inches;
        return inches2cm;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance in yards");
        double yards=sc.nextDouble();
        System.out.println("Enter the distance in feet");
        double feet=sc.nextDouble();
        System.out.println("Enter the distance in meters");
        double meters=sc.nextDouble();
        System.out.println("Enter the distance in inches");
        double inches=sc.nextDouble();

        System.out.println(yards+" yards is "+convertYardsToFeet(yards)+" is miles" );
        System.out.println(feet+" feet is "+convertFeetToYards(feet)+" is yards" );
        System.out.println(meters+" meters is "+convertMetersToInches(meters)+" is inches" );
        System.out.println(feet+" inches is "+convertInchesToMeters(inches)+" is meters" );
        System.out.println(feet+" inches is "+convertInchesToCm(inches)+" is cm" );
    }
}

