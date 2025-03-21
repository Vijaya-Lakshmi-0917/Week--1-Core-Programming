import java.util.*;
public class methods_level3_Question11 {
    public static int[][] salaryAndYears() {
        int[][] salaryAndYearsArray = new int[10][2];
        Random rand= new Random();
        for (int i = 0; i < 10; i++) {
            salaryAndYearsArray[i][0] = rand.nextInt(90000)+10000;
            salaryAndYearsArray[i][1] = rand.nextInt(10) +  1;
        }
    return salaryAndYearsArray;
    }
    public static int[][] newSalaryAndBonus(int[][] salaryAndYearsArray){
        int[][] newSalaryAndBonusArray=new int[10][2];
        for (int i = 0; i < 10; i++) {
            if (salaryAndYearsArray[i][1] >= 5) {
                newSalaryAndBonusArray[i][0] = salaryAndYearsArray[i][0] + ((salaryAndYearsArray[i][0]) * 5 / 100);
                newSalaryAndBonusArray[i][1] = salaryAndYearsArray[i][0] * 5 / 100;
            } else if (salaryAndYearsArray[i][1] < 5) {
                newSalaryAndBonusArray[i][0] = salaryAndYearsArray[i][0] + ((salaryAndYearsArray[i][0]) * 2 / 100);
                newSalaryAndBonusArray[i][1] = salaryAndYearsArray[i][0] * 2 / 100;
            }
        }
        return newSalaryAndBonusArray;
    }
    public static int[] sumOfsalaryNewSalaryAndBonus(int[][] salaryAndYearsArray, int[][] newSalaryAndBonusArray ){
        int[] sumArray=new int[3];
        int salary=0;
        int newSalary=0;
        int bonus=0;
        for (int i=0; i<10;i++){
            salary+=salaryAndYearsArray[i][0];
            newSalary+=newSalaryAndBonusArray[i][0];
            bonus+=newSalaryAndBonusArray[i][1];
            sumArray[0]=salary;
            sumArray[1]=newSalary;
            sumArray[2]=bonus;
        }
        return sumArray;
    }
    public static void main(String[] args){
        int[][] salaryAndYearsArray=salaryAndYears();
        int [][] newSalaryAndBonusArray=newSalaryAndBonus(salaryAndYearsArray);
        int[] sumArray=sumOfsalaryNewSalaryAndBonus(salaryAndYearsArray,newSalaryAndBonusArray);

        Formatter fmt =new Formatter();
        fmt.format("%15s %15s %15s\n", "Total salary", "Total new salary","Total bonus" );
        fmt.format("%12s %13s %16s\n", sumArray[0], sumArray[1],sumArray[2] );
        System.out.println(fmt);
    }
}
