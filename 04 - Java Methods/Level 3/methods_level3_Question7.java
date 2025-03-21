import java.util.*;
public class methods_level3_Question7 {
    public static boolean otpGenerator(){
        int[] otpArray=new int[10];
        for(int i=0; i<10;i++){
            otpArray[i]=(int)(100000+Math.random()*900000);
        }
        boolean condition=true;
        for(int i=0; i<9;i++) {
            for (int j = i + 1; j <10 ; j++) {
                if (otpArray[i] == otpArray[j]) {
                    condition = false;
                }
            }
        }
        if (condition){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        System.out.println(otpGenerator());
    }
}
