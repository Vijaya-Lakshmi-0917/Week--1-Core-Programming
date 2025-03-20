import java.lang.*;
import java.util.*;
public class BMI_using_2D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees ");
        int number = sc.nextInt();
        double BMI;
        double weight, height;
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Enter the weight of employee " + (i + 1));
            personData[i][0] = sc.nextDouble();
            if (personData[i][0] <= 0) {
                i--;
            }
        }
        for (int i = 0; i < number; i++) {
            System.out.println("Enter the height of employee " + (i + 1));
            personData[i][1] = sc.nextDouble();
            if (personData[i][1] <= 0) {
                i--;
            }
        }
        for (int i = 0; i < number; i++) {
            weight = personData[i][0];
            height = personData[i][1];
            BMI = weight / (height * height);
            personData[i][2] = BMI;

        }
        for (int i = 0; i < number; i++) {
            if (personData[i][2] <= 18.5) {
                weightStatus[i] = "Under weight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] >= 25 && personData[i][2] <= 39.9) {
                weightStatus[i] = "Over weight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        for (int i = 0; i < number; i++) {
            System.out.printf("Weight: %.1f kg, Height: %.2f m, BMI: %.2f, Status: %s\n",personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}
