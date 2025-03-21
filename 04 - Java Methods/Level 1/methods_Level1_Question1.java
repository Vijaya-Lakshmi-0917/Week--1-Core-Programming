import java.util.*;
public class methods_Level1_Question1 {
    public static double simpleInterest(double principle, double rate, double time) {
       return principle * rate * time / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle");
        double principle = sc.nextDouble();
        System.out.println("Enter the rate");
        double rate = sc.nextDouble();
        System.out.println("Enter the time");
        double time = sc.nextDouble();
        double si= principle * rate * time / 100;
        System.out.println("The Simple Interest is " + si+" for Principal "+ principle+" , Rate of Interest "+rate+" and Time "+time);

    }
}

