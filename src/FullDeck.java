//representa um baralho de 52 cartas
public class FullDeck {
    private Card[] deck; //vetor de cartas - baralho em si
    private int currentCard; //posição da carta a ser distribuida (0 - 51)
    private final int NUMBER_OF_CARDS = 52; //numero de cartas

    public FullDeck(){
        String[] faces = { "Ás", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez", "Valete", "Dama", "Rei" };
        String[] suits = { "Copas", "Paus", "Ouros", "Espadas" };

        //inicializar String
        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0;

        //preenche baralho com as cartas
        int cardIndex = 0
        for(int i = 0; i< suits.length; i++){ //percorrer os naipes
            for(int j = 0; j< faces.length; j++) { //percorrer os valores
                deck[cardIndex++] = new Card(faces[j], suits[i]);
            }
        }
    }

    //distribui carta
    public Card dealCard(){
        //se ainda houver carta para distribuir
        if (currentCard < deck.length) {
            return deck[currentCard++]; //retorna carta e incrementa contador
        }

        return null;
    }
}
