import java.util.*;
public class methods_level3_Question10 {
    public static void collinear(){
        double x1=2;
        double x2=4;
        double x3=6;
        double y1=4;
        double y2=6;
        double y3=8;

        double slopeAB= (y2 - y1)/(x2 - x1);
        double slopeBC=(y3 - y2)/(x3 - x2);
        double slopeAC=(y3 - y1)/(x3 - x1);
        if (slopeAB==slopeBC && slopeBC==slopeAC) {
            System.out.println(" The 3 points are collinear");
        }
        else{
            System.out.println(" the 3 points are non-collinear");
        }
    }
    public static void collinearUsingAreaOfATriangle(){
        double x1=2;
        double x2=4;
        double x3=6;
        double y1=4;
        double y2=6;
        double y3=8;
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        if (area==0){
            System.out.println(" The 3 points are collinear");
        }
        else{
            System.out.println(" the 3 points are non-collinear");
        }
    }
    public static void main(String[] args){
        System.out.println("collinearity using formula. ");
        collinear();
        System.out.println("collinearity using area of a triangle. ");
        collinearUsingAreaOfATriangle();

    }
}
