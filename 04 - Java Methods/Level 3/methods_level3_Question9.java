import java.util.*;
public class methods_level3_Question9 {
    public static double euclideanDistance(double x1, double x2, double y1, double y2){
        double x=Math.pow((x2-x1), 2);
        double y=Math.pow((y2-y1), 2);
        double distance= Math.sqrt(x)+Math.sqrt(y);
        return distance;

    }
    public static double[] equationOfLine(double x1, double x2, double y1, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        double[] equationOfLineArray = new double[2];
        equationOfLineArray[0] = m;
        equationOfLineArray[1] = b;
        return equationOfLineArray;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the point x1");
        double x1=sc.nextDouble();
        System.out.println("Enter the point x2");
        double x2=sc.nextDouble();
        System.out.println("Enter the point y1");
        double y1=sc.nextDouble();
        System.out.println("Enter the point y2");
        double y2=sc.nextDouble();
        System.out.println("The euclidean distance is "+euclideanDistance(x1,x2,y1,y2));
        double [] equationOfLineArray=equationOfLine(x1,x2,y1,y2);
        System.out.println("The Slope, m is equal to  "+equationOfLineArray[0]);
        System.out.println("The y- intercept b is equal to  "+equationOfLineArray[1]);

    }
}
