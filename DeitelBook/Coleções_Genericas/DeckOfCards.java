import java.util.List;
import java.util.Arrays;
import java.util.Collections;

/**
 * Card
 */
class Card {

    public static enum Face {Ace, Deuce, Three, Four, Five, Six, 
        Seven, Eight, Nine, Ten, Jack, Queen, King};
    public static enum Suit {Clubs, Diamonds, Hearts, Spades};

    private final Face face;
    private final Suit suit;


    public Card(Face face, Suit suit) {
        this.face = face;
        this.suit = suit;
    }

    public Face getFace() {
        return this.face;
    }

    public Suit getSuit() {
        return this.suit;
    }

    @Override
    public String toString() {
        return getFace() + " of " + getSuit();
    }
}

/**
 * DeckOfCards
 */
public class DeckOfCards {

    private List<Card> list;

    public DeckOfCards() {
        
        Card[] deck = new Card[52];
        int count = 0;

        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Face face : Card.Face.values()) {
                deck[count] = new Card(face, suit);
                ++count;
            }
        }

        list = Arrays.asList(deck);
        Collections.shuffle(list);
    }

    public void printCards(){

        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%-19s%s", list.get(i),
                ( (i+1) % 4 == 0) ? "\n" : "" );
        }
    }

    public static void main(String[] args) {
        
        DeckOfCards deck = new DeckOfCards();
        deck.printCards();
    }
}