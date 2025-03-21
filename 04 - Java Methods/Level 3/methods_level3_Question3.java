import java.util.*;
public class methods_level3_Question3 {
    public static int countOfDigits(int number) {
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        return count;
    }

    public static int[] storeTheDigits(int number) {
        int count = countOfDigits(number);
        int[] digitsArray = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digitsArray[i] = number % 10;
            number /= 10;
        }
        return digitsArray;
    }
    public static int sumOfSquares(int[] digitsArray){
        int sum=0;
        for(int i=0; i< digitsArray.length; i++){
            sum+=Math.pow(digitsArray[i],2);
        }
        return sum;
    }
    public static void harshadNumber(int number,int[] digitsArray){
        int sum=0;
        for(int i=0; i< digitsArray.length; i++){
            sum+=digitsArray[i];
        }
        if (number%sum==0){
            System.out.println(" The number "+ number+" is a harshad number ");
        }
        else{
            System.out.println(" The number "+ number+" is not a harshad number ");
        }
    }
    public static int[][] frequencyOfDigits(int number) {
        int count = countOfDigits(number);
        int[][] frequencyArray = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequencyArray[i][0] = i;
        }
        while (number > 0) {
            int remainder = number % 10;
            if (remainder == 0) {
                frequencyArray[0][1]++;
                number /= 10;
            }
            if (remainder == 1) {
                frequencyArray[1][1]++;
                number /= 10;
            }
            if (remainder == 2) {
                frequencyArray[2][1]++;
                number /= 10;
            }

            if (remainder == 3) {
                frequencyArray[3][1]++;
                number /= 10;
            }
            if (remainder == 4) {
                frequencyArray[4][1]++;
                number /= 10;
            }

            if (remainder == 5) {
                frequencyArray[5][1]++;
                number /= 10;
            }
            if (remainder == 6) {
                frequencyArray[6][1]++;
                number /= 10;
            }

            if (remainder == 7) {
                frequencyArray[7][1]++;
                number /= 10;
            }
            if (remainder == 8) {
                frequencyArray[8][1]++;
                number /= 10;
            }
            if (remainder == 9) {
                frequencyArray[9][1]++;
                number /= 10;
            }
        }
        return frequencyArray;
    }
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("The count of numbers " + countOfDigits(number));
        System.out.println("----------------------------------------------------------------------------");
        int[] digitsArray = storeTheDigits(number);
        for (int i = 0; i < digitsArray.length; i++) {
            System.out.println(digitsArray[i]);
        }
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(" The sum of squares "+sumOfSquares(digitsArray));
        System.out.println("----------------------------------------------------------------------------");
        harshadNumber(number, digitsArray);
        System.out.println("----------------------------------------------------------------------------");
        int[][] frequencyArray = frequencyOfDigits(number);
        for (int i = 0; i < 10; i++) {
            System.out.println("The Frequency of " + i +" is " +frequencyArray[i][1]);
        }
        System.out.println("----------------------------------------------------------------------------");
    }
}
