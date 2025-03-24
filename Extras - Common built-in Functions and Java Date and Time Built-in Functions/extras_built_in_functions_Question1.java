import java.util.*;
public class extras_built_in_functions_Question1 {
    public static void guessingGame(Scanner sc) {
        int computerGuess = (int) (Math.random() * 100 + 1);
        System.out.println("Enter a number between 1-100");
        int userInput = sc.nextInt();
            if(userInput>100 || userInput<1){
                System.out.println("Enter a valid number");
                guessingGame(sc);
            }
            else {
                if (computerGuess == userInput) {
                    System.out.println("correct");
                } else if (computerGuess < userInput) {
                    System.out.println("low");
                } else {
                    System.out.println("high");
                }
                System.out.println("To Continue the game enter \"continue\" or to stop the game enter\"stop\"");
                String string = sc.next();
                if (string.equals("continue")) {
                    guessingGame(sc);
                } else if (string.equals("stop")) {
                    System.out.println("Game Over");
                }
            }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        guessingGame(sc);
    }
}
