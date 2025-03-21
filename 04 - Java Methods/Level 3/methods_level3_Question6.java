import java.util.*;
public class methods_level3_Question6 {
    public static int[] factors(int number) {
        int count = 0;
        for (int i = 1; i < number; i++) {
            if (number %i == 0) {
                count++;
            }
        }
        int[] factorsArray = new int[count];
        int index = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                factorsArray[index] = i;
                index++;
            }
        }
        return factorsArray;
    }
    public static int greatestFactor(int number, int[] factorsArray){
        int count = 0;
        for (int i = 1; i < number; i++) {
            if (number %i == 0) {
                count++;
            }
        }
        int GreatestFactor=factorsArray[count-1];
        return GreatestFactor;
    }
    public static int sumOfFactors(int number, int[] factorsArray){
        int count = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += factorsArray[i];
        }
        return sum;
    }
    public static int productOfFactors(int number, int[] factorsArray){
        int count = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int product = 1;
        for (int i = 0; i < count; i++) {
            product *= factorsArray[i];
        }
        return product;
    }
    public static int sumOfCubeOfFactors(int number, int[] factorsArray){
        int count = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += Math.pow(factorsArray[i],3);
        }
        return sum;
    }
    public static void properNumber(int number, int[] factorsArray){
        int sum=sumOfFactors(number,factorsArray);
        if (sum==number){
            System.out.println(" the number is a perfect number ");
        }
        else{
            System.out.println(" the number is not a perfect number ");
        }
    }
    public static void abundantNumber(int number, int[] factorsArray){
        int sum=sumOfFactors(number,factorsArray);
        if (sum>number){
            System.out.println(" the number is an abundant number ");
        }
        else{
            System.out.println(" the number is not an abundant number ");
        }
    }
    public static void deficientNumber(int number, int[] factorsArray){
        int sum=sumOfFactors(number,factorsArray);
        if (sum<number){
            System.out.println(" the number is a deficient number ");
        }
        else{
            System.out.println(" the number is not a deficient number ");
        }
    }
    public static int factorial(int r){
        int product=1;
        for(int i=r; i>=1;i--){
            product*=i;
        }
        return product;
    }
    public static void strongNumber(int number, int[] factorsArray){
        int sum=0;
        while(number!=0){
            int r=number%10;
            number/=10;
            sum=sum+factorial(r);
            }
        if (sum==number){
            System.out.println(" the number is a Strong number ");
        }
        else{
            System.out.println(" the number is not a strong number ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int[] factorsArray=factors(number);
        System.out.println(greatestFactor(number, factorsArray));
        System.out.println(productOfFactors(number,factorsArray));
        System.out.println(sumOfFactors(number,factorsArray));
        System.out.println(sumOfCubeOfFactors(number,factorsArray));
        properNumber(number,factorsArray);
        abundantNumber(number, factorsArray);
        deficientNumber(number, factorsArray);
        strongNumber(number, factorsArray);
    }
}
