import java.util.*;
public class methods_level2_Question12 {
    public static int[] generate4DigitRandomArray(int size){
        int[] numbers= new int[5];
        for(int i=0; i<5;i++){
            numbers[i]=(int)(Math.random()*9000)+size;
        }
        return numbers;
    }
    public static double[] findAverageMinMax(int[] numbers){
        double[] AverageMinMax=new double[3];
        int sum=0;
        for(int i=0; i<5; i++) {
            sum += numbers[i];
        }
        AverageMinMax[0]=sum/5;
        int maxNumber=numbers[0];
        for (int i=1; i<4; i++) {
            maxNumber=Math.max(numbers[i],numbers[i+1]);
        }

        int minNumber=numbers[0];
        for (int i=1; i<4; i++) {
            minNumber=Math.min(numbers[i],numbers[i+1]);
        }

        AverageMinMax[1]=maxNumber;
        AverageMinMax[2]=minNumber;
        return AverageMinMax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size");
        int size = sc.nextInt();
        int[] numbers = generate4DigitRandomArray(size);
        double[] AverageMinMax = findAverageMinMax(numbers);
        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(AverageMinMax[i]);
        }
    }
}

