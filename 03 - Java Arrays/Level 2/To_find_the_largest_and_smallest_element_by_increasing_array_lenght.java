import java.lang.*;
import java.util.*;
public class To_find_the_largest_and_smallest_element_by_increasing_array_lenght {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
        int index = 0;
        int maxDigit=10;
        int[] numArray = new int[maxDigit];

        while (number > 0) {
            if (index==maxDigit){
                maxDigit=maxDigit*2;
                numArray=Arrays.copyOf(numArray, maxDigit);
            }
            numArray[index] = number % 10;
            number = number / 10;
            index++;
        }

        if (index == 1) {
            System.out.println("The largest digit is" + numArray[0] + "No second largest presnt");
        }
        int largestDigit = numArray[0];
        int secondLargestDigit = numArray[0];
        for (int i = 0; i < 10; i++) {
            if (numArray[i] > largestDigit) {
                largestDigit = numArray[i];
            }
        }
        for (int i = 0; i < 10; i++) {
            if ((numArray[i] > secondLargestDigit) && numArray[i] != largestDigit) {
                secondLargestDigit = numArray[i];
            }

        }
        largestDigit = numArray[0];
        secondLargestDigit = numArray[0];

        for (int i = 0; i < index; i++) {
            if (numArray[i] > largestDigit) {
                largestDigit = numArray[i];
            }
            else if ((numArray[i] > secondLargestDigit) && (numArray[i] != largestDigit)) {
                secondLargestDigit = numArray[i];
            }
        }
        System.out.println("The largest element in the array is: " + largestDigit);
        System.out.println("The second largest element in the array is: " + secondLargestDigit);
    }
}
