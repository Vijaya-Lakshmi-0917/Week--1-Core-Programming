import java.util.*;
public class methods_level1_Question2 {
    static int handshakes(int n) {
        int combination =n*(n-1)/2;
        return combination;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  a number");
        int n=sc.nextInt();
        System.out.println("The number of possible hand shakes : "+handshakes(n));
    }
}
