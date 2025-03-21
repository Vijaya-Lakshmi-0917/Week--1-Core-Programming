import java.util.*;
public class methods_level1_Question5 {
    static int positiveNegativeZero(int n) {
        if (n < 0) {
            return (-1);
        } else if (n == 0) {
            return 0;
        } else {
            return 1;
        }
    }
    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(positiveNegativeZero(n));

    }
}
