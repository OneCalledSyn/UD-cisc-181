import java.util.Random;

public class CardGame {

    public static void main(String[] args) {

        private Deck deckofcards;

        public CardGame() {
            deckofcards = new Deck();
        }
        public void printRandomCardNum() {
            Random r = new Random();
            /**int x = r.nextInt();*/
            int x = r.nextInt(deckofcards.deck.length);
            /**System.out.println();*/
            System.out.println(deckofcards.deck[x].num);
        }
    }
}