import java.util.*;
public class methods_level1_Question10 {
    static int[] findQuotientAndRemainder(int numberOfChocolates, int numberOfChildren){
        int[] result=new int[2];
        result[0]=numberOfChocolates/numberOfChildren;
        result[1]=numberOfChocolates%numberOfChildren;
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of chocolates");
        int numberOfChocolates=sc.nextInt();
        System.out.println(" Enter the number of Children");
        int numberOfChildren=sc.nextInt();
        int[] result=findQuotientAndRemainder( numberOfChocolates, numberOfChildren);
        System.out.println("The number of chocolates per child is " + result[0]);
        System.out.println("remaining Chocolates " + result[1]);
    }
}
