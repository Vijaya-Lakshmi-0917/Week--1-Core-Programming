import java.util.*;
public class methods_level2_Question9 {
    public static boolean isPositive(int[] integerArray) {
        boolean positiveOrNegative=false;
        for (int i=0; i<5; i++) {
            if (integerArray[i] >= 0) {
                System.out.println(" the number " +integerArray[i]+" is positive");
                positiveOrNegative=true;
            }
            else {
                System.out.println(" the number " +integerArray[i]+" is negative");
            }

        }
        return positiveOrNegative;
    }

    public static void isEven(int[] integerArray) {
        for (int i=0; i<5; i++) {
            if (integerArray[i] % 2 == 0) {
                System.out.println(" the number " +integerArray[i]+" is even");
            }
            else {
                System.out.println(" the number "+integerArray[i]+" is odd");
            }

        }
    }

    public static int compare(int[] integerArray) {
        boolean comparison = true;
        if (integerArray[0] > integerArray[4]) {
            System.out.println("The first element is greater than the last element.");
            return 1;
        } else if (integerArray[0] < integerArray[4]) {
            System.out.println("The first element is lesser than the last element.");
            return -1;
        }
        else {
            System.out.println("The first element is equal to the last element.");
            comparison= false;
        }
        return comparison? 0: -1;

    }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            int[] integerArray = new int[5];
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter number"+(i+1));
                integerArray[i] = sc.nextInt();

            }
            boolean toCheckPositive =isPositive(integerArray);
            if (toCheckPositive) {
                isEven(integerArray);
            }

            System.out.println(compare(integerArray));

        }
}

