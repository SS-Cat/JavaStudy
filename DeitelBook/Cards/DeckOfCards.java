//classe DeckOfCards representa um baralho.
import java.util.Random;

/**
 * DeckOfCards
 */
public class DeckOfCards {

    private Card[] deck; // array de objetos Deck
    private int currentCard; //indice do próximo card a ser distribuido
    private static final int NUMBER_OF_CARDS = 52; //número constante de Cards
    //gerador de número aleatório
    private static final Random randomNumbers = new Random();

    //construtor preenche baralho de cartas
    public DeckOfCards(){
        String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
         "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades"};

        deck = new Card[NUMBER_OF_CARDS]; //cria array de objetos Card
        currentCard = 0; //configura currentCard então o primeiro Card distribuido é deck[0]

        //preenche baralho com objetos Card
        for(int count = 0; count < deck.length ; count++){
            deck[count] = new Card(faces[count%13], suits[count/13]);
        }
    }

    //embaralha as cartas com um algoritmo de uma passagem
    public void shuffle(){
        //depoid de embaralhar, a distribuição deve iniciar em deck[0] novamente
        currentCard = 0;

        //para cada Card, seleciona outro Card aleatório e os compara
        for ( int first = 0; first < deck.length ; first++ ){
            //seleciona um número aleatório entre 0 e 51
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            //compara Card atual com Card aleatoriamente selecionado
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    //distribui um Card
    public Card dealCard(){
        //determina se ainda há Cards a serem distribuidos
        if(currentCard < deck.length)
            return deck[currentCard++ ]; //retorna carta atual no array
        else
            return null; //retorna nulo para indicar que todos os Cards foram distribuidos
    }
}