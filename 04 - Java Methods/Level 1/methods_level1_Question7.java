import java.util.*;
public class methods_level1_Question7 {
    static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i < (n+1); i++){
            sum+=i;
        }

        return sum;
    }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println(" Enter a number ");
            int n = sc.nextInt();
            System.out.println(" The sum of n natural numbers is: " + sumOfNaturalNumbers(n));
        }
    }
