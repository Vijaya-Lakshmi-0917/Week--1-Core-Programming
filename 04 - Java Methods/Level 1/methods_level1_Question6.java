import java.util.*;
public class methods_level1_Question6 {
    static void spring(int date, int month) {
        if ((month == 3 && date >= 20) || (month == 6 && date <= 20) || month == 4 || month == 5) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Its not a Spring Season");
        }
    }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the date");
            int date = sc.nextInt();
            System.out.println("Enter the month");
            int month = sc.nextInt();
            spring(date,month);
        }
    }