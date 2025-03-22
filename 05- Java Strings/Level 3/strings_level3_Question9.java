import java.util.*;
public class strings_level3_Question9 {
    public static String[] month() {
        String[] monthArray = {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
        return monthArray;
    }
    public static int[] days(int year) {
        int[] daysArray = {31, 28, 31, 30, 31, 30, 30, 31, 30, 31, 30, 31};
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            daysArray[1] = 29;
        }
        return daysArray;
    }
    public static int firstDayOfTheMonth(int year, int month){
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d = (1 + x + 31*m0 / 12) % 7;
        return d;
    }
    public static void display(String[] monthArray,int[] daysArray,int d, int month, int year){
        int firstDay=firstDayOfTheMonth(year, month);
        int totalDays=daysArray[month-1];
        System.out.println(monthArray[month-1]+" "+ year);
        System.out.printf("%3s\t%3s\t%3s\t%3s\t%3s\t%3s\t%3s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
        for(int i=0; i<firstDay;i++){
            System.out.print("\t");
        }
        for(int i=1; i<=totalDays; i++){
            System.out.printf("%3d\t", i);
            if((i+firstDay)%7==0){
                System.out.println();
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year.");
        int year= sc.nextInt();
        System.out.println("Enter the month.");
        int month=sc.nextInt();
        String[] monthArray=month();
        int[] daysArray=days(year);
        int d=firstDayOfTheMonth(year, month);
        display(monthArray,daysArray, d, month, year);
        }
    }
