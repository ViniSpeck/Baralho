//representa uma carta de baralho
public class Card {
    private final String face; //valor de face da carta (ás, dois, rei...)
    private final String suit; //naipe da carta (ouro, pau...)

    //construtor
    public Card(String face, String suit){
        this.face = face;
        this.suit = suit;
    }
    //não tem set pq a variável é final, não se altera

    //retorna a representação em String da Carta
    //"Ás de ouros", "três de copas"...
    @Override
    public String toString(){
        return face + " de " + suit;
    }
}
