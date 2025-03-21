import java.util.*;
public class methods_level1_Question9 {
    static int[] findQuotientAndRemainder(int number, int divisor){
        int[] result=new int[2];
        result[0]=number/divisor;
        result[1]=number%divisor;
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int number=sc.nextInt();
        System.out.println(" Enter the divisor");
        int divisor=sc.nextInt();
        int[] result=findQuotientAndRemainder( number, divisor);
        System.out.println("quotient is equal to " + result[0]);
        System.out.println("remainder is equal to " + result[1]);
    }
}
