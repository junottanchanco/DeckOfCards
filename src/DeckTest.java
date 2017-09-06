
public class DeckTest {

	public static void main(String[] args) {
		Deck deck1 = new Deck();
		deck1.deckArr.get(25).displayCard();
		deck1.shuffle();
		deck1.deckArr.get(25).displayCard();
		

	}

}
