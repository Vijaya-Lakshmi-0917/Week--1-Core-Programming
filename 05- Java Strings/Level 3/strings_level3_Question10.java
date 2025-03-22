import java.util.*;
public class strings_level3_Question10 {
    public static String[] suits() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        return suits;
    }

    public static String[] ranks() {
        String[] ranks = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        return ranks;
    }

    public static String[] deckOfCards(String[] suits, String[] ranks) {
        int numberOfCards = suits.length * ranks.length;
        String[] deckOfCards = new String[numberOfCards];
        int index = 0;
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deckOfCards[index++] = ranks[i] + " " + suits[j];
            }
        }
        return deckOfCards;
    }

    public static void shuffleDeck(String[] deckOfCards) {
        int n = deckOfCards.length;
        for (int i = 0; i < n; i++) {
            int randomCard = i + (int) (Math.random() * (n - i));
            String temp = deckOfCards[i];
            deckOfCards[i] = deckOfCards[randomCard];
            deckOfCards[randomCard] = temp;
        }
    }

    public static String[][] distributionOfCards(String[] deckOfCards, int numberOfCards, int numberOfPlayers) {
        if (numberOfCards > deckOfCards.length || numberOfCards % numberOfPlayers != 0) {
            System.out.println("Cards cannot be distributed.");
            return null;
        }
        int cardsPerPlayer = numberOfCards / numberOfPlayers;
        String[][] players = new String[numberOfPlayers][cardsPerPlayer];
        int index = 0;
        for (int i = 0; i < numberOfPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deckOfCards[index++];
            }
        }
        return players;
    }

    public static void display(String[][] players) {
        if (players == null) {
            return;
        }
        for (int i = 0; i < players.length; i++) {
            System.out.println();
            System.out.println("Player " + (i + 1));
            for (String j : players[i]) {
                System.out.println(". "+j);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of players");
        int numberOfPlayers = sc.nextInt();
        System.out.println("Enter the number of cards to be distributed ");
        int numberOfCards = sc.nextInt();
        String[] suits = suits();
        String[] ranks = ranks();
        String[] deckOfCards = deckOfCards(suits, ranks);
        shuffleDeck(deckOfCards);
        String[][] players = distributionOfCards(deckOfCards, numberOfCards, numberOfPlayers);
        display(players);
    }
}
