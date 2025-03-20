import java.lang.*;
import java.util.*;
public class Amar_Akbar_Anthony_using_Arrays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] ageArray=new int[3];
        Double[] heightArray=new Double[3];
        for(int i=0; i<3;i++) {
            System.out.println("Enter the Age of friend " +(i+1));
            ageArray[i]=sc.nextInt();
        }
        for(int i=0; i<3;i++) {
            System.out.println("Enter the Height of friend " + (i + 1));
            heightArray[i] = sc.nextDouble();
        }
        int minAge=ageArray[0];
        double maxHeight=heightArray[0];

        for(int i=0;i<3;i++) {
            if (heightArray[i] > maxHeight) {
                maxHeight = heightArray[i];
            }
        }
        for(int i=0;i<3;i++) {
            if (ageArray[i] < minAge) {
                minAge = ageArray[i];
            }
        }
        if(minAge==ageArray[0]) {
            System.out.println("Amar is the tallest");
        }
        else if(minAge==ageArray[1]) {
            System.out.println("Akbar is the tallest");
        }
        else {
            System.out.println("Anthony is the tallest");
        }
        if(maxHeight==heightArray[0]) {
            System.out.println("Amar is the youngest");
        }
        else if(maxHeight==heightArray[1]) {
            System.out.println("Akbar is the youngest");
        }
        else {
            System.out.println("Anthony is the youngest");
        }


    }
}
