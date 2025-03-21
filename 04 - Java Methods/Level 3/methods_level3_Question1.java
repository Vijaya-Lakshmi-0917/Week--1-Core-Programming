import java.util.*;
public class methods_level3_Question1 {
    public static double sumOfElementsPresentInArray(double [] heightArray){
        double sum=0;
        for(int i=0;i<11 ;i++) {
            sum += heightArray[i];
        }
        return sum;
    }
    public static double meanHeight(double [] heightArray) {
        double sum = 0;
        double count = 0;
        for (int i = 0; i < 11; i++) {
            sum += heightArray[i];
            count++;
        }
        double mean = sum / count;
        return mean;
    }
    public static double maxHeight(double [] heightArray){
        double maximumHeight=heightArray[0];
        for(int i=0;i<(11-1) ;i++) {
            double max=Math.max(heightArray[i], heightArray[i+1]);
                maximumHeight=max;
        }
        return maximumHeight;
    }
    public static double minHeight(double [] heightArray){
        double minimumHeight=heightArray[0];
        for(int i=0;i<(11-1) ;i++) {
            double min=Math.min(heightArray[i], heightArray[i+1]);
                minimumHeight=min;
            }
        return minimumHeight;
    }
    public static void main(String[] args){
        double [] heightArray= new double[11];
        for (int i =0; i<11; i++){
            heightArray[i]=150 + Math.random()*250;
        }
        System.out.println("The sum of elements present in the array "+sumOfElementsPresentInArray(heightArray));
        System.out.println("The mean height is "+meanHeight(heightArray));
        System.out.println("the maximum height in the array"+maxHeight(heightArray));
        System.out.println("the minimum height in the array"+minHeight(heightArray));

    }
}


