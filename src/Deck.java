import java.util.*;

public class Deck {
	ArrayList<Card> deckArr = new ArrayList<Card>();
	public Deck() {
	String[] suits = new String[]{"Hearts", "Clubs", "Spades", "Diamonds"};
		for (int i = 0; i < suits.length; i++) {
			for (int k = 1; k <= 13; k++) {
				if (k == 1) {
					deckArr.add(new Card(suits[i], "Ace"));
				}
				else if(k == 11) {
					deckArr.add(new Card(suits[i], "Jack"));
				}
				else if(k == 12) {
					deckArr.add(new Card(suits[i], "Queen"));
				}
				else if(k == 13) {
					deckArr.add(new Card(suits[i], "King"));
				}
				else {deckArr.add(new Card(suits[i], String.valueOf(k)));}
			}
		}
	}
	
	public Deck shuffle() {
		Collections.shuffle(this.deckArr);
		return this;
	}
}
