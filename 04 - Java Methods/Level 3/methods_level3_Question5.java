import java.util.*;
public class methods_level3_Question5 {
    public static void primeNumber(int number){
        int count=0;
        for (int i=1; i<number;i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count>1){
            System.out.println(" The given number is not a prime number");
        }
        else{
            System.out.println(" The given number is a prime number");
        }
    }
    public static void neonNumber(int number){
        int square=number*number;
        int sum=0;
        while(square!=0){
            int r=square%10;
            square/=10;
            sum+=r;
        }
        if(number==sum){
            System.out.println(" The number is a neon number. ");
        }
        else{
            System.out.println(" The number is not a neon number. ");
        }
    }
    public static void spyNumber(int number){
        int sum=0;
        int product=1;
        while (number!=0){
            int r=number%10;
            sum+=r;
            product*=r;
            number/=10;
        }
        if(sum==product){
            System.out.println(" The given number is a spy number. ");
        }
        else{
            System.out.println(" The given number is not a spy number. ");
        }
    }
    public static void automorphicNumber(int number){
        double square=number*number;
        double count=0;
        while (number!=0) {
            number /= 10;
            count++;
        }
        double s=Math.pow(10,count);
        double r=square%s;
        if (number==r){
            System.out.println(" The given number is an automorphic number. ");
        }
        else{
            System.out.println(" The given number is not an automorphic number. ");
        }
    }
    public static void buzzNumber(int number){
        int r=number%10;
        if (r==7 || number%7==0){
            System.out.println(" The given number is a buzz number. ");
        }
        else{
            System.out.println(" The given number is not a buzz number. ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number= sc.nextInt();
        primeNumber(number);
        neonNumber(number);
        spyNumber(number);
        automorphicNumber(number);
        buzzNumber(number);
    }

}
