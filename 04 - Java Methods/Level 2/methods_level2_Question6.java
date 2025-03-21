import java.util.*;
public class methods_level2_Question6 {
    public static double convertFarhenheitToCelsius(double farhenheit)  {
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
        return farhenheit2celsius;
    }
    public static double convertCelciusToFarenheit(double celsius)  {
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius2farhenheit;
    }
    public static double convertPoundsToKilograms(double pounds)  {
        double pounds2kilograms = 0.453592*pounds;
        return pounds2kilograms;
    }
    public static double convertKilogramsToPounds(double kilograms)  {
        double kilograms2pounds = 2.20462*kilograms;
        return kilograms2pounds;
    }
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541*gallons;
        return gallons2liters;
    }
    public static double convertLitersToGallons(double liters)  {
        double liters2gallons = 0.264172*liters;
        return liters2gallons;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature in farenheit");
        double farenheit=sc.nextDouble();
        System.out.println("Enter the temperature in celsius");
        double celsius=sc.nextDouble();
        System.out.println("Enter the weight in pounds");
        double pounds=sc.nextDouble();
        System.out.println("Enter the weight in kilograms");
        double kilograms=sc.nextDouble();
        System.out.println("Enter the quantity in gallons");
        double gallons=sc.nextDouble();
        System.out.println("Enter the quantity in liters");
        double liters=sc.nextDouble();

        System.out.println(farenheit+" farenheit is "+convertFarhenheitToCelsius(farenheit)+" celsius" );
        System.out.println(celsius+" celsius is "+convertCelciusToFarenheit(celsius)+" farenheit" );
        System.out.println(pounds+" pounds is "+convertPoundsToKilograms(pounds)+" pounds" );
        System.out.println(kilograms+" kilograms is "+convertKilogramsToPounds(kilograms)+" kilograms" );
        System.out.println(gallons+" gallons is "+convertGallonsToLiters(gallons)+" liters" );
        System.out.println(liters+" liters is "+convertLitersToGallons(liters)+" gallons" );
    }
}
