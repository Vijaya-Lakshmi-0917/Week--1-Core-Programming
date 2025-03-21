import java.util.*;
public class methods_level2_Question1 {
    public static double factors(double number) {
        int count = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                count += 1;
            }
        }
        int index = 0;
        double[] factorsArray = new double[count];
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                factorsArray[index] = i;
                index++;

            }
        }
        double sumOfFactors = 0;
        for (int i = 1; i < factorsArray.length; i++) {
            sumOfFactors += factorsArray[i];
        }
        return sumOfFactors;
    }

    public static double ProductOfFactors(double number) {
        int count = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                count += 1;
            }
        }
        int index = 0;
        double[] productOfFactorsArray = new double[count];
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                productOfFactorsArray[index] = i;
                index++;
            }
        }
        double productOfFactors = 1;
        for (int i = 1; i < productOfFactorsArray.length; i++) {
            productOfFactors *= productOfFactorsArray[i];
        }
        return productOfFactors;
    }


    public static double SquareOfFactors(double number) {
        int count = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                count += 1;
            }
        }
        int index = 0;
        double[] sumOfSquareOfFactorsArray = new double[count];
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfSquareOfFactorsArray[index] = Math.pow(i, 2);
                index++;
            }
        }
        double sumOfSquareOfFactors = 0;
        for (int i = 1; i < sumOfSquareOfFactorsArray.length; i++) {
            sumOfSquareOfFactors += sumOfSquareOfFactorsArray[i];
        }
        return sumOfSquareOfFactors;

    }

    //public static int sumOfSquares(){
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(factors(number));
        System.out.println(ProductOfFactors(number));
        System.out.println(SquareOfFactors(number));
    }
}