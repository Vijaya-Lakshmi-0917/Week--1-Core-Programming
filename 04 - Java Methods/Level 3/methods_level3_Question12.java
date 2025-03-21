import java.util.*;
public class methods_level3_Question12 {
    public static int[][] marks(int number) {
        int[][] marksArray = new int[number][3];
        Random rand = new Random();
        for (int i = 0; i < number; i++) {
            marksArray[i][0] = rand.nextInt(101);
            marksArray[i][1] = rand.nextInt(101);
            marksArray[i][2] = rand.nextInt(101);
        }
        return marksArray;
    }

    public static double[][] totalAveragePercentage(int number, int[][] marksArray) {
        double[][] totalAveragePercentageArray = new double[number][3];
        for (int i = 0; i < number; i++) {
            totalAveragePercentageArray[i][0] = marksArray[i][0] + marksArray[i][1] + marksArray[i][2];
            totalAveragePercentageArray[i][1] = (marksArray[i][0] + marksArray[i][1] + marksArray[i][2]) / 3;
            totalAveragePercentageArray[i][2] = Math.round(((marksArray[i][0] + marksArray[i][1] + marksArray[i][2]) / 300.0) * 100);
        }
        return totalAveragePercentageArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[][] marksArray = marks(number);
        double[][] totalAveragePercentageArray = totalAveragePercentage(number, marksArray);

        String[][] remarksAndGrade = new String[number][2];
        for (int i = 0; i < number; i++) {
            if (totalAveragePercentageArray[i][2] > 80) {
                remarksAndGrade[i][0] = "Level 4, above agency-normalized standards";
                remarksAndGrade[i][1] = "Grade A";
            } else if (totalAveragePercentageArray[i][2] >= 70 && totalAveragePercentageArray[i][2] <= 79) {
                remarksAndGrade[i][0] = "Level 3, at agency-normalized standards";
                remarksAndGrade[i][1] = "Grade B";
            } else if (totalAveragePercentageArray[i][2] >= 60 && totalAveragePercentageArray[i][2] <= 69) {
                remarksAndGrade[i][0] = "Level 2, below, but approaching agency-normalized standards";
                remarksAndGrade[i][1] = "Grade C";

            } else if (totalAveragePercentageArray[i][2] >= 50 && totalAveragePercentageArray[i][2] <= 59) {
                remarksAndGrade[i][0] = "Level 1, well below agency-normalized standards";
                remarksAndGrade[i][1] = "Grade D";
            } else if (totalAveragePercentageArray[i][2] >= 40 && totalAveragePercentageArray[i][2] <= 49) {
                remarksAndGrade[i][0] = "Level 1, too below agency-normalized standards";
                remarksAndGrade[i][1] = "Grade E";

            } else if (totalAveragePercentageArray[i][2] <= 39) {
                remarksAndGrade[i][0] = "Remedial standards";
                remarksAndGrade[i][1] = "Grade R";
            }
        }
        System.out.printf("%15s \t %15s \t %15s \t %16s \t %15s\n", "Total marks", "average", "percentage", "grade ", "remarks");
        for (int i = 0; i < number; i++) {
            System.out.printf("%12s \t %18s \t %12s \t %20s \t %15s\n", totalAveragePercentageArray[i][0], totalAveragePercentageArray[i][1], totalAveragePercentageArray[i][2], remarksAndGrade[i][1], remarksAndGrade[i][0]);
        }
    }
}
