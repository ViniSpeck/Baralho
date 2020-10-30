import java.sql.SQLOutput;

public class DeckTest {
    public static void main(String[] args) {
        FullDeck deck = new FullDeck();
        deck.shuffle();

        for (int i = 0; i < 52; i++) {
            System.out.println(deck.dealCard());
        }

        }
    }

