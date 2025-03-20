import java.lang.*;
import java.util.*;
public class Show_all_the_numbers_as_well_as_the_sum_of_all_numbers {
    public static void main(String[] args) {
        int n, i, j;
        double total = 0.0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        double[] numArray = new double[n];
        i = 0;
        j = 0;
        while (i < n) {
            System.out.println("Enter the number.");
            numArray[i] = sc.nextDouble();
            i++;
        }
        System.out.println("The array elements are :");

        while (j < n) {
            System.out.println("number " + (j + 1) + " =  " + numArray[j]);
            j++;
        }
        while (true) {
            if (n <= 0) {
                break;
            } else {
                for (i = 0; i < n; i++) {
                    total += numArray[i];
                }
            }
            if (i == n) {
                break;

            }
        }
        System.out.println(total);
    }
}	