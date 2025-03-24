import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class extras_built_in_functions_time_and_date_Question2 {
    public static void dateArithmetic(String date){
        LocalDate inputDate =LocalDate.parse(date);
        LocalDate newDate=inputDate.plusDays(7).plusMonths(1).plusYears(2);
        LocalDate finalDate= newDate.minusWeeks(3);
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(finalDate.format(formatter));
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the date in the format yyyy-mm-dd");
        String date=sc.nextLine();
        dateArithmetic(date);
    }
}
