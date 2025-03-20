import java.lang.*;
import java.util.*;
public class BMI_using_1D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        double BMI;
        double[] weightArray = new double[number];
        double[] heightArray = new double[number];
        double[] BMIArray = new double[number];
        String[] BMIStatusArray = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Enter the weight of person  " + (i + 1));
            weightArray[i] = sc.nextDouble();
        }
        for (int i = 0; i < number; i++) {
            System.out.println("Enter the height of person  " + (i + 1));
            heightArray[i] = sc.nextDouble();
        }
        for (int i = 0; i < number; i++) {
            BMI= weightArray[i]/(heightArray[i]*heightArray[i]);
            BMIArray[i] = BMI;
        }
        for (int i = 0; i < number; i++) {
            if(BMIArray[i]<= 18.5){
                BMIStatusArray[i]="Under weight";
            }
            else if(BMIArray[i]>=18.5 && BMIArray[i]<=24.9){
                BMIStatusArray[i]="Normal";
            }
            else if(BMIArray[i]>=25 && BMIArray[i]<=39.9){
                BMIStatusArray[i]="Over weight";
            }
            else{
                BMIStatusArray[i]="Obese";
            }
        }
        for (int i=0; i<number;i++) {
            System.out.println("weight of person " + (i + 1) +" "+ weightArray[i]);
            System.out.println("weight of person " + (i + 1) + " "+ heightArray[i]);
            System.out.println("weight of person " + (i + 1) +" " + BMIArray[i]);
            System.out.println("weight of person " + (i + 1) +" " + BMIStatusArray[i]);
        }
    }
}
