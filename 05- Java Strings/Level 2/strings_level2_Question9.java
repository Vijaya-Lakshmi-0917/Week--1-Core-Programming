import java.util.*;
public class strings_level2_Question9 {
    public static int computerChoice() {
        int computerInput = (int) (Math.random() * 3);
        return computerInput;
    }
    public static int[] gameUserOrComputer(int number) {
        int[] gameArray = new int[2];
        int computerPoints = 0;
        int userPoints = 0;
        for (int i = 0; i < number; i++) {
            int computerInput = computerChoice();
            Scanner sc = new Scanner(System.in);
            System.out.println(" Enter 0 for rock, 1 for paper, and 2 for Scissor");
            int userInput = sc.nextInt();
            if (computerInput == 0 && userInput == 1 || computerInput == 1 && userInput == 2 || computerInput == 2 && userInput == 0) {
                userPoints++;
            } else {
                computerPoints++;
            }
        }
        gameArray[0] = userPoints;
        gameArray[1] = computerPoints;
        return gameArray;
    }
    public static String[][] calculationOfAverageAndPercentageOfGamesWon(int[] gameArray, int number) {
        String[][] averageAndPercentageArray = new String[2][3];
        averageAndPercentageArray[0][0] = "Computer";
        averageAndPercentageArray[1][0] = "User";
        int userPoints = gameArray[0];
        int computerPoints = gameArray[1];
        double averageOfcomputer = (double)computerPoints / number;
        double averageOfuser = (double)userPoints / number;
        averageAndPercentageArray[0][1] = String.valueOf(averageOfcomputer);
        averageAndPercentageArray[1][1] = String.valueOf(averageOfuser);
        double percentageOfcomputer = averageOfcomputer * 100;
        double percentageOfuser = averageOfuser * 100;
        averageAndPercentageArray[0][2] = String.valueOf(percentageOfcomputer);
        averageAndPercentageArray[1][2] = String.valueOf(percentageOfuser);
        return averageAndPercentageArray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number of rounds ");
        int number = sc.nextInt();
        int[] gameArray = gameUserOrComputer(number);
        String[][] averageAndPercentageArray = calculationOfAverageAndPercentageOfGamesWon(gameArray, number);
        System.out.printf(" %15s %15s %15s\n", "game", "average", "percentage");
        for (int i = 0; i < 2; i++) {
            System.out.printf("%15s %15s %15s\n", averageAndPercentageArray[i][0], averageAndPercentageArray[i][1], averageAndPercentageArray[i][2]);
        }
    }
}
