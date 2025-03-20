import java.util.*;
public class Reverse_digits_using_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        int[] numArray = new int[10];
        int index = 0;

        while (number > 0 && index < 10) {
            numArray[index] = number % 10;
            number = number / 10;
            index++;

        }
        System.out.println("The number in reverse order is ");
        for (int i = 0; i < index; i++) {
            System.out.print(numArray[i]);
        }
    }
}
