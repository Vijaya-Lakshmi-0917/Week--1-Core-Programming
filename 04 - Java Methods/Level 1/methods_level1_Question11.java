import java.util.*;
public class methods_level1_Question11 {
    static double calculateWindChill(double temperature, double windSpeed) {
        double a = Math.pow(windSpeed, 0.16);
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * a;
        return windChill;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature");
        double temperature = sc.nextDouble();
        System.out.println("Enter the wind speed");
        double windSpeed = sc.nextDouble();
        System.out.println(calculateWindChill(temperature, windSpeed));
    }
}

