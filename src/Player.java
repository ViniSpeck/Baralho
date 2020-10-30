//representa um jogador de truco que possui
// uma mão de 3 cartas (vetor)

public class Player {
    private Card[] hand; //mão do jogador
    private final int HAND_SIZE = 3;//tamanho padrão da mão do truco
    private int currentCard;

    public Player() {
        hand = new Card[HAND_SIZE];
        currentCard = 0;
    }

    public void receiveCard(Card card){ //insere carta na mão do jogador
        if(currentCard<HAND_SIZE) { //se a mão não estiver cheia
            hand[currentCard++] = card;
        }
    }
    public Card playCard(int index){ // retira uma carta da mão e joga
        Card temp = hand[index]; //pega a carta escolhida
        hand[index] = null; //remove a carta da mão
        return temp; //retorna a carta escolhida
    }

}
