import java.util.*;
public class methods_level3_Question4 {
    static int countOfDigits(int number) {
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

    public static int[] reversedOrderOfDigits(int number) {
        int count = countOfDigits(number);
        int[] reversedDigitsArray = new int[count];
        for (int i = 0; i < count; i++) {
            reversedDigitsArray[i] = number % 10;
            number /= 10;
        }
        return reversedDigitsArray;

    }

    public static void compare(int[] digitsArray, int[] reversedDigitsArray) {
        if (digitsArray.length == reversedDigitsArray.length) {
            for (int i = 0; i < digitsArray.length; i++) {
                if (digitsArray[i] != reversedDigitsArray[i]) {
                    System.out.println("The two arrays are not equal");
                    break;
                }
            }
            System.out.println("The two arrays are equal");
        }
    }

    public static void palindrome(int[] digitsArray, int[] reversedDigitsArray) {
        if (digitsArray.length == reversedDigitsArray.length) {
            for (int i = 0; i < digitsArray.length; i++) {
                if (digitsArray[i] != reversedDigitsArray[i]) {
                    System.out.println("not a palindrome");
                    break;
                }
            }
            System.out.println("it's a palindrome");
        }
    }

    public static void duckNumber(int[] digitsArray) {
        boolean isducknumber = false;
        for (int i = 1; i < digitsArray.length; i++) {
            if (digitsArray[i] == 0) {
                isducknumber = true;
                break;
            }
        }
        if (isducknumber) {
            System.out.println("The number is a duck number");
        } else {
            System.out.println("The number is not a duck number");
        }
    }


    public static void main(String[] args) {
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
        int[] reversedDigitsArray = reversedOrderOfDigits(number);
        for (int i = 0; i < reversedDigitsArray.length; i++) {
            System.out.println(reversedDigitsArray[i]);
        }
        System.out.println("----------------------------------------------------------------------------");
        compare(digitsArray, reversedDigitsArray);
        System.out.println("----------------------------------------------------------------------------");
        palindrome(digitsArray, reversedDigitsArray);
        System.out.println("----------------------------------------------------------------------------");
        duckNumber(digitsArray);
        System.out.println("----------------------------------------------------------------------------");
    }
}
