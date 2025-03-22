import java.util.*;
public class strings_level3_Question1 {
    public static double[][] weightAndHeight() {
        double[][] weightAndHeightArray = new double[10][2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the weight of employee " + (i + 1));
            weightAndHeightArray[i][0] = sc.nextDouble();
            System.out.println("Enter the height in cm of employee " + (i + 1));
            weightAndHeightArray[i][1] = sc.nextDouble();
        }
        return weightAndHeightArray;
    }

    public static String[][] BMI(double[][] weightAndHeightArray) {
        String[][] BMIArray = new String[10][2];
        for (int i = 0; i < 10; i++) {
            BMIArray[i][0] = String.valueOf((weightAndHeightArray[i][0]*10000) / ((weightAndHeightArray[i][1]) * (weightAndHeightArray[i][1])));
        }
        for (int i = 0; i < 10; i++) {
            if (Double.parseDouble(BMIArray[i][0]) <= 18.5) {
                BMIArray[i][1] = "Under weight";
            } else if (Double.parseDouble(BMIArray[i][0]) >= 18.5 && Double.parseDouble(BMIArray[i][0]) <= 24.9) {
                BMIArray[i][1] = "Normal";
            } else if (Double.parseDouble(BMIArray[i][0]) >= 25 && Double.parseDouble(BMIArray[i][0]) <= 39.9) {
                BMIArray[i][1] = "Over weight";
            } else {
                BMIArray[i][1] = "Obese";
            }
        }
        return BMIArray;
    }
    public static String[][] BMIStatus(double[][] weightAndHeightArray,String[][] BMIArray ){
        String [][] BMIStatusArray= new String[10][4];
        for (int i=0; i<10; i++){
            BMIStatusArray[i][0]=String.valueOf(weightAndHeightArray[i][0]);
            BMIStatusArray[i][1]=String.valueOf(weightAndHeightArray[i][1]);
            BMIStatusArray[i][2]=BMIArray[i][0];
            BMIStatusArray[i][3]=BMIArray[i][1];
        }
        return BMIStatusArray;
    }
    public static void display(String[][] BMIStatusArray){
        System.out.printf("%20s %20s %20s %20s\n", "Weight","Height", "BMI", "BMI Status"  );
        for(int i=0; i<10;i++){
            System.out.printf("%20s %20s %20s %20s\n",BMIStatusArray[i][0],BMIStatusArray[i][1], BMIStatusArray[i][2],BMIStatusArray[i][3]);
        }
    }

    public static void main(String[] args) {
        double[][] weightAndHeightArray = weightAndHeight();
        String[][] BMIArray= BMI(weightAndHeightArray);
        String [][] BMIStatusArray= BMIStatus(weightAndHeightArray,BMIArray );
        display(BMIStatusArray);
        }
    }
