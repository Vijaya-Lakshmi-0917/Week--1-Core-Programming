import java.util.*;
public class methods_level3_Question2 {
    public static int countOfDigits(int number) {
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        return count;
    }

    public static int[] storeTheDigits(int number) {
        int count=countOfDigits(number);
        int[] digitsArray = new int[count];
        for (int i =count-1; i >=0; i--) {
            digitsArray[i] = number % 10;
            number/=10;
        }
        return digitsArray;

    }

    public static void duckNumber(int [] digitsArray) {
        boolean isducknumber = false;
        for(int i = 1; i < digitsArray.length; i++) {
            if (digitsArray[i] == 0) {
                isducknumber = true;
                break;
            }
        }
        if(isducknumber){
            System.out.println("The number is a duck number");
        }
        else{
            System.out.println("The number is not a duck number");
        }
    }
    public static void armstrongNumber(int number, int [] digitsArray) {
        int count = 0;
        for (int i = 0; i < digitsArray.length; i++) {
            count += Math.pow(digitsArray[i], 3);
        }
        if (number == count) {
            System.out.println("The number is an armstrong number");
        } else {
            System.out.println("The number is not an armstrong number");
        }
    }
    public static void largestAndSecondLargest(int [] digitsArray) {
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for (int i=0; i<digitsArray.length;i++) {
            if (digitsArray[i] > largest) {
                largest = digitsArray[i];
            } else if (digitsArray[i] > secondLargest && secondLargest != largest) {
                secondLargest = digitsArray[i];
            }
        }
        System.out.println("The largest element in the array is: " + largest);
        System.out.println("The second largest element in the array is: " + secondLargest);

    }
    public static void smallestAndSecondSmallest(int [] digitsArray) {
        int smallest= Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        for (int i=0; i<digitsArray.length;i++) {
            if (digitsArray[i] < smallest) {
                smallest = digitsArray[i];
            } else if (digitsArray[i] < secondSmallest && secondSmallest != smallest) {
                secondSmallest = digitsArray[i];
            }
        }
        System.out.println("The smallest element in the array is: " + smallest);
        System.out.println("The second smallest element in the array is: " + secondSmallest);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("The count of numbers"+countOfDigits(number));
        int[] digitsArray = storeTheDigits(number);
        for (int i = 0; i < digitsArray.length; i++) {
            System.out.println(digitsArray[i]);
        }
        duckNumber(digitsArray);
        armstrongNumber(number,digitsArray);
        largestAndSecondLargest(digitsArray);
        smallestAndSecondSmallest(digitsArray);
    }
}

