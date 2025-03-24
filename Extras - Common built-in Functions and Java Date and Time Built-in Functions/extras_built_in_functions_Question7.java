import java.math.BigInteger;
import java.util.*;
public class extras_built_in_functions_Question7 {
    public static int Gcd(int number1, int number2) {
        int GCD= BigInteger.valueOf(number1).gcd(BigInteger.valueOf(number2)).intValue();
        return GCD;
    }
    public static int Lcm(int number1, int number2) {
        int LCM= number1*number2/Gcd(number1, number2);
        return LCM;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1= sc.nextInt();
        System.out.println("Enter the second number");
        int number2= sc.nextInt();
        System.out.println("The Greatest common divisor is:"+Gcd( number1, number2));
        System.out.println("The least common multiple is:"+Lcm( number1, number2));
    }
}
