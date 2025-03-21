import java.util.*;
public class methods_level2_Question11 {
    public static double [] roots(double a, double b, double c){
        double[] rootsArray=new double[2];
        double delta = Math.pow(b,2)+ 4*a*c;
        //double root1=(-b) + Math.sqrt(delta)/2*a;
        //double root2=(-b) - Math.sqrt(delta)/2*a;

        if (delta>0) {
            double root1=(-b) + Math.sqrt(delta)/2*a;
            rootsArray[0] = root1;
            double root2=(-b) - Math.sqrt(delta)/2*a;
            rootsArray[1] = root2;
            return rootsArray;
        }
        else if (delta==0) {
            double root = (-b) / (2 * a);
            rootsArray[0] = root;
            return rootsArray;
        }
        else{
            return rootsArray;

        }

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double a=sc.nextInt();
        double b=sc.nextInt();
        double c=sc.nextInt();
        double[] rootsArray=roots(a, b, c);
        for(int i =0; i<2; i++){
            System.out.println(rootsArray[i]);
        }


    }
}
