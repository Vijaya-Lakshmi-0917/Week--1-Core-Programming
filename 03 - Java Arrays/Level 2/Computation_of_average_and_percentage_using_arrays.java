import java.lang.*;
import java.util.*;
public class Computation_of_average_and_percentage_using_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] chemistryMarksArray = new int[n];
        int[] mathsMarksArray = new int[n];
        int[] physicsMarksArray = new int[n];
        double[] averageArray = new double[n];
        double[] percentageArray = new double[n];
        for (int i = 0; i < n; i++) {
            chemistryMarksArray[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            mathsMarksArray[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            physicsMarksArray[i]=sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
                averageArray[i]=(chemistryMarksArray[i] + mathsMarksArray[i] + physicsMarksArray[i]) / 3;
        }
        for (int i = 0; i < n; i++) {
            percentageArray[i] = ((chemistryMarksArray[i] + mathsMarksArray[i] + physicsMarksArray[i]) / 300) * 100;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("average and percentage of student "+(i+1)+" "+averageArray[i]);
        }
        for (int i = 0; i < n; i++) {
            if (percentageArray[i] > 80) {
                System.out.println("remarks and grade of student "+(i+1));
                System.out.println("Level 4, above agency-normalized standards");
                System.out.println("Grade A");
            } else if (percentageArray[i] >= 70 && percentageArray[i] <= 79) {
                System.out.println("remarks and grade of student "+(i+1));
                System.out.println("Level 3, at agency-normalized standards");
                System.out.println("Grade B");
            } else if (percentageArray[i] >= 60 && percentageArray[i] <= 69) {
                System.out.println("remarks and grade of student "+(i+1));
                System.out.println("Level 2, below, but approaching agency-normalized standards");
                System.out.println("Grade C");

            } else if (percentageArray[i] >= 50 && percentageArray[i] <= 59) {
                System.out.println("remarks and grade of student "+(i+1));
                System.out.println("Level 1, well below agency-normalized standards");
                System.out.println("Grade D");
            } else if (percentageArray[i] >= 40 && percentageArray[i] <= 49) {
                System.out.println("remarks and grade of student "+(i+1));
                System.out.println("Level 1-, too below agency-normalized standards");
                System.out.println("Grade E");

            } else if (percentageArray[i] <= 39) {
                System.out.println("remarks and grade of student "+(i+1));
                System.out.println("Remedial standards");
                System.out.println("Grade R");
            }
        }
    }
}