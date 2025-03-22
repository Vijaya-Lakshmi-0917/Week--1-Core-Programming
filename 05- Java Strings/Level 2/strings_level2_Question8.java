import java.util.*;
public class strings_level2_Question8 {
    public static int[] Ages(int n) {
        int[] agesArray = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            agesArray[i] = (int) (10 + Math.random() * 90);
        }
        return agesArray;
    }

    public static String[][] eligibilityOfVoting(int[] agesArray, int n) {
        String[][] eligibilityArray = new String[n][2];
        for (int i = 0; i < n; i++) {
            eligibilityArray[i][0] = Integer.toString(agesArray[i]);
            if (agesArray[i] > 18) {
                eligibilityArray[i][1] = "true";
            } else {
                eligibilityArray[i][1] = "false";
            }
        }
        return eligibilityArray;
    }

    public static void display(String[][] eligibilityArray, int n) {
        System.out.printf("%15s %15s\n", "Age", "Eligibility");
        for (int i = 0; i < n; i++) {
            System.out.printf("%15s %15s\n", eligibilityArray[i][0], eligibilityArray[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Students");
        int n = sc.nextInt();
        int[] agesArray= Ages(n);
        String[][] eligibilityArray = eligibilityOfVoting( agesArray, n);
        display(eligibilityArray, n);
    }
}
