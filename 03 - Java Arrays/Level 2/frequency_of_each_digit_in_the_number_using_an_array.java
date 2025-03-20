
import java.lang.*;
import java.util.*;
public class frequency_of_each_digit_in_the_number_using_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int[] frequencyArray = new int[10];
        while (number > 0) {
            int remainder = number % 10;
            if (remainder == 0) {
                frequencyArray[0]++;
                number /= 10;
            }
            if (remainder == 1) {
                frequencyArray[1]++;
                number /= 10;
            }
            if (remainder == 2) {
                frequencyArray[2]++;
                number /= 10;
            }

            if (remainder == 3) {
                frequencyArray[3]++;
                number /= 10;
            }
            if (remainder == 4) {
                frequencyArray[4]++;
                number /= 10;
            }

            if (remainder == 5) {
                frequencyArray[5]++;
                number /= 10;
            }
            if (remainder == 6) {
                frequencyArray[6]++;
                number /= 10;
            }

            if (remainder == 7) {
                frequencyArray[7]++;
                number /= 10;
            }
            if (remainder == 8) {
                frequencyArray[8]++;
                number /= 10;
            }
            if (remainder == 9) {
                frequencyArray[9]++;
                number /= 10;
            }
        }
        int count = 0;
        for (int i = 0; i < 10; i++) {
            count = count + frequencyArray[i];
        }
        System.out.println("The total count of digits is: " + count);

        for (int i = 0; i < 10; i++) {
            System.out.println("the frequency of number " + i + " " + frequencyArray[i]);
        }
    }
}
