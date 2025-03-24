import java.time.LocalDate;
import java.util.Scanner;
public class extras_built_in_functions_time_and_date_Question4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first date in yyyy-mm-dd format");
        String inputDate1= sc.next();
        LocalDate date1 = LocalDate.parse(inputDate1);
        System.out.println("Enter the second date in yyyy-mm-dd format");
        String inputDate2= sc.next();
        LocalDate date2 = LocalDate.parse(inputDate2);
        if(date1.isBefore(date2)){
            System.out.println("The date " +date1+ " comes before.");
        }
        else if(date1.isAfter(date2)){
            System.out.println("The date " +date1+ " comes before "+ date2);
        }
        else if(date1.isEqual(date2)){
            System.out.println("The date " +date1+" and " + date2+ " are equal.");
        }
    }
}
