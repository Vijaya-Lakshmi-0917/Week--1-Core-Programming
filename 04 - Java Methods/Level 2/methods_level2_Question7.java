import java.util.*;
public class methods_level2_Question7 {
    public static boolean canStudentVote(int age) {
            if (age >= 18) {
                return true;
            } else {
                return false;
            }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ageArray = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the age of student "+(i+1));
            ageArray[i] = sc.nextInt();
        }
        for(int i=0;i<10;i++){
            if (canStudentVote(ageArray[i])) {
                System.out.println("student "+(i+1)+ " is eligible to vote");
                System.out.println("Eligibility "+ canStudentVote(ageArray[i]));

            } else {
                System.out.println("student "+(i+1)+ " is not eligible to vote");
                System.out.println("Eligibility "+ canStudentVote(ageArray[i]));
            }
        }
    }
}
