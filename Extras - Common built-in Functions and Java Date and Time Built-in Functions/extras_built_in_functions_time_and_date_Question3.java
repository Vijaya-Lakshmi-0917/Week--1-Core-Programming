import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class extras_built_in_functions_time_and_date_Question3 {
    public static void main(String[] args){
        LocalDate date= LocalDate.now();
        DateTimeFormatter formatter1= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2= DateTimeFormatter.ofPattern("yy-MM-dd");
        DateTimeFormatter formatter3= DateTimeFormatter.ofPattern("EEE,MMM dd,yyyy");
        System.out.println(date.format(formatter1));
        System.out.println(date.format(formatter2));
        System.out.println(date.format(formatter3));
    }
}
