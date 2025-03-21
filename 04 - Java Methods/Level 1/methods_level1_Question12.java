import java.util.*;
public class methods_level1_Question12 {
    public static double[] calculateTrigonometricFunctions(double angle){
        double rad= Math.toRadians(angle);
        double[] trigonometry=new double[3];
        trigonometry[0]=Math.sin(rad);
        trigonometry[1]=Math.cos(rad);
        trigonometry[2]=Math.tan(rad);
        return trigonometry;

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the angle in degrees");
        double angle= sc.nextDouble();
        double [] trigonometry=calculateTrigonometricFunctions(angle);
        System.out.println("Sin value"+trigonometry[0]);
        System.out.println("Cos value"+trigonometry[1]);
        System.out.println("tan value"+trigonometry[2]);
    }
}
