import java.util.*;
public class methods_level1_Question4 {
    static double roundsCalculation(double a, double b, double c) {
        double distance = 5;
        double calculation = (a + b + c)/(distance*1000);
        return (calculation);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of side 1");
        double a = sc.nextDouble();
        System.out.println("Enter the length of  side 2");
        double b = sc.nextDouble();
        System.out.println("Enter the length of side 3");
        double c = sc.nextDouble();
        System.out.println("the number of rounds is: " + roundsCalculation(a, b, c));
    }
}

