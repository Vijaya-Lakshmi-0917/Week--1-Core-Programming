import java.lang.*;
import java.util.*;
public class Zara_salary_and_bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salaryArray = new double[10];
        double[] yearsOfServiceArray = new double[10];
        double[] bonusArray = new double[10];
        double[] newSalaryArray = new double[10];
        double totalOldSalary = 0, totalBonus = 0, totalNewSalary = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the salary of employee: " + (i + 1));
            salaryArray[i] = sc.nextDouble();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the number of years of sevice of employee: " + (i + 1));
            yearsOfServiceArray[i] = sc.nextDouble();
        }
        for (int i = 0; i < 10; i++) {
            if (yearsOfServiceArray[i] > 5) {
                bonusArray[i] = (salaryArray[i] * 0.05);
            }
            else if (yearsOfServiceArray[i] > 2) {
                bonusArray[i] = (salaryArray[i] * 0.02);
            }
        }
        for (int i = 0; i < 10; i++) {
            newSalaryArray[i] = bonusArray[i] + salaryArray[i];
        }
        for (int i = 0; i < 10; i++) {
            totalOldSalary = totalOldSalary + salaryArray[i];
        }
        for (int i = 0; i < 10; i++) {
            totalBonus = totalBonus + bonusArray[i];
        }
        for (int i = 0; i < 10; i++) {
            totalNewSalary = totalNewSalary + newSalaryArray[i];
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("the old salary of employee " + (i + 1) +" "+ salaryArray[i]);
            System.out.println("the bonus of employee " + (i + 1) +" "+ bonusArray[i]);
            System.out.println("the new salary of employee " + (i + 1)+" "+ newSalaryArray[i]);
        }

        System.out.println("The total old Salary is: " + totalOldSalary);
        System.out.println("The total bonus is: " + totalBonus);
        System.out.println("The total new Salary: " + totalNewSalary);
    }
}