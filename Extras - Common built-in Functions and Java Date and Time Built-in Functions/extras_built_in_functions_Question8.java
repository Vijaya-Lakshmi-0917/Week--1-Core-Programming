import java.util.*;
public class extras_built_in_functions_Question8 {
    public static double farenheitTocelsius(double temperatureInFarenheit){
        return (temperatureInFarenheit-32)*5/9;
    }
    public static double celsiusToFarenheit(double temperatureInCelsius){
        return (temperatureInCelsius * 9/5) + 32;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the temperature in farenheit");
        double temperatureInFarenheit= sc.nextDouble();
        System.out.println("Enter the temperature in celsius");
        double temperatureInCelsius= sc.nextDouble();
        System.out.println("The temperature in celsius is "+farenheitTocelsius(temperatureInFarenheit));
        System.out.println("The temperature in farenheit is "+celsiusToFarenheit(temperatureInCelsius));
    }
}
