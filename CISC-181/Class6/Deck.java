public class Deck {
    public Card[] deck;

    public Deck() {
        Card[] arr = new Card[52];
        String[] suits = {"Club", "Spade", "Diamond", "Heart"};
        int index = 0;
        for (String s: suits) {
            for (int i = 1; i <= 13; i++) {
                arr[index] = new Card(i,s);
                index++;
            }
        }
    }
    public String toString() {
        String str = "";
        for (Card i: deck) {
            str += i.num + i.suit + " ";
        }
        return(str);
    }
}