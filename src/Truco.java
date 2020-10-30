//Classe truco:
//dois jogadores
//uma carta virada
public class Truco {
    private Player player1;
    private Player player2;
    private Card turnedCard;
    private TrucoDeck deck;

    public Truco(){
        player1 = new Player();
        player2 = new Player();
        deck = new TrucoDeck();
    }

    public void startGame() { //método que embaralha, distribui cartas e vira a carta na mesa
        deck.shuffle();
        for (int i = 0; i < 3; i++) { //distribui 3 cartas por jogador
            player1.receiveCard(deck.dealCard());
            player2.receiveCard(deck.dealCard());
        }
        turnedCard = deck.dealCard();
    }
    public void printTable() { //imprime a mão dos dois jogadores e a carta virada
        System.out.printf("Jogador 1: %s\t\t%s\t\tJogador 2: %s\n", player1, turnedCard, player2);
    }
}
