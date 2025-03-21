import java.util.*;
public class methods_level2_Question2 {
    static int sumOfNNaturalNumbersUsingRecursion(int n) {
        if (n < 0) {
            System.out.println("Not a valid number");
            return n;
        }
        if (n == 1)
            return 1;
        return n + sumOfNNaturalNumbersUsingRecursion(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumOfNNaturalNumbersUsingFormula = n * (n + 1) / 2;
        System.out.println("The sum of n natural numbers is: "+sumOfNNaturalNumbersUsingRecursion(n));
        if (sumOfNNaturalNumbersUsingFormula == sumOfNNaturalNumbersUsingRecursion(n)) {
            System.out.println("result from both the computations are correct");
        } else {
            System.out.println("result from both the computations are incorrect");
        }
    }
}
