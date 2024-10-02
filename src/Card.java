import java.util.Objects;

public class Card implements Comparable<Card>{

	private Rank rank;
	private Suit suit;
	
	public Card(Rank rank, Suit suit) {
		if(rank == null || suit == null) {
			throw new NullPointerException();
		}
		this.rank = rank;
		this.suit = suit;
	}
	
	@Override
	public int compareTo(Card card) {
		// TODO Auto-generated method stub
		if(getSuit().compareTo(card.getSuit()) < 0) {
			return -1;
		}
		else if(getSuit().compareTo(card.getSuit()) > 0) {
			return 1;
		}
		else {
			if(getRank().compareTo(card.getRank()) < 0) {
				return -1;
			}
			else if(getRank().compareTo(card.getRank()) > 0) {
				return 1;
			}
			else {
				return 0;
			}
		}
		
	}

	public boolean equals(Object obj) {
		if(obj instanceof Card) {
			Card c = (Card) obj;
			if(getSuit().equals(c.getSuit()) && getRank().equals(c.getRank())) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	public Rank getRank() {
		return rank;
	}
	
	public Suit getSuit() {
		return suit;
	}
	
	public int hashCode() {
		return Objects.hash(getRank(),getSuit());
		
	}
	
	public String toString() {
		return rank.toString() + suit.toString();
		
	}
}
