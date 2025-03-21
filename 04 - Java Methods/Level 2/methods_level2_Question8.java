import java.util.*;
public class methods_level2_Question8 {
    public static void AmarAkbarAnthony(double[] ageArray, double[] heightArray) {
        double minAge = ageArray[0];
        double maxHeight = heightArray[0];

        for (int i = 0; i < 3; i++) {
            if (heightArray[i] > maxHeight) {
                maxHeight = heightArray[i];
            }
        }
        for (int i = 0; i < 3; i++) {
            if (ageArray[i] < minAge) {
                minAge = ageArray[i];
            }
        }
        if (minAge == ageArray[0]) {
            System.out.println("Amar is the youngest");
        } else if (minAge == ageArray[1]) {
            System.out.println("Akbar is the youngest");
        } else {
            System.out.println("Anthony is the youngest");
        }
        if (maxHeight == heightArray[0]) {
            System.out.println("Amar is the tallest");
        } else if (maxHeight == heightArray[1]) {
            System.out.println("Akbar is the tallest");
        } else {
            System.out.println("Anthony is the tallest");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] ageArray = new double[3];
        double[] heightArray = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the Age of friend " + (i + 1));
            ageArray[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the Height of friend " + (i + 1));
            heightArray[i] = sc.nextDouble();
        }
        AmarAkbarAnthony(ageArray,heightArray);

    }
}