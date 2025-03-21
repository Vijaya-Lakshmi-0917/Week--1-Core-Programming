import java.util.*;
public class methods_level2_Question3 {
    public static void leapYearOrNot(int year){
        if (year> 1582){
            if(((year % 4==0)&&(year%100!=0)) || (year%400==0)){
                System.out.println("its a leap year");
            }
            else{
            System.out.println("its not a leap year");
            }
        }
        else {
            System.out.println("Not a valid input");
        }
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int year=sc.nextInt();
        leapYearOrNot(year);
    }
}
