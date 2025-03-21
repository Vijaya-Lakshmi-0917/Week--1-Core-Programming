import java.util.*;
public class methods_level3_Question8 {
    public static String[] month() {
        String[] monthArray = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return monthArray;
    }

    public static boolean leapYear(int year) {
        boolean isLeapYear = false;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            isLeapYear = true;
        }
        return isLeapYear;
    }

    public static int[] days(boolean isLeapYear) {
        int[] daysArray = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeapYear = true) {
            daysArray[1] = 29;
        }
        return daysArray;
    }

    public static int firstDayOfTheMonth(int y, int m) {
        int y0, x, m0, d0;
        y0 = y - (14 - m) / 12;
        x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
        m0 = m + 12 * ((14 - m) / 12) - 2;
        d0 = (1 + x + (31 * m0) / 12) % 7;

        return d0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Year");
        int y=sc.nextInt();
        System.out.println("Enter the month");
        int m=sc.nextInt();

        String[] monthArray=month();
        boolean isLeapYear=leapYear(y);
        int[] daysArray=days(isLeapYear);
        int firstDay = firstDayOfTheMonth(y, m);
        int totalDays = daysArray[m - 1];

        System.out.println("\n" + monthArray[m - 1] + " " + y);
        System.out.printf("%3s\t%3s\t%3s\t%3s\t%3s\t%3s\t%3s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");

        for (int i = 0; i < firstDay; i++) {
            System.out.print("\t");
        }
        for (int day = 1; day <= totalDays; day++) {
            System.out.printf("%3d\t", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
