/**
 * DeckOfCardsTest
 * embaralhando e distribuindo cartas.
 */
public class DeckOfCardsTest {

    public static void main(String[] args) {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle(); //coloca Cards em ordem aleatória

        //imprime todas as 52 cartas na ordem em que são distribuidas
        for(int i = 0; i <= 52; i++){
            //distribui e exibe um Card
            System.out.printf("%-19s", myDeckOfCards.dealCard());

            if(i % 4 == 0) // imprime uma nova linha a cada 4 cartas
                System.out.println();
        }
    }
}