import java.lang.*;
import java.util.*;
public class multiples_of_a_number_taken_as_user_input_below_100 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        number = sc.nextInt();
        if (number < 0 || number > 100) {
            System.out.println("Number not valid");
        } else {
            System.out.println("Multiples of " + number + " are");
            for (int i = number; i <= 100; i += number) {
                System.out.println(i);
            }
        }
    }
}