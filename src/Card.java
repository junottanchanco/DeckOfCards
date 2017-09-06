
public class Card {
	private String suit;
	private String rank;
	
	public Card(String suit, String rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	public void setCard(String suit, String rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	public Card getCard() {
		return this;
	}
	
	public void displayCard() {
		System.out.println(this.rank + " of " + this.suit);
	}
}
