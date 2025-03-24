import java.util.*;
public class extras_built_in_functions_Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        int result = Math.max(number3,Math.max(number1, number2));
        System.out.println("The maximum of three numbers is: "+result);
    }
}
