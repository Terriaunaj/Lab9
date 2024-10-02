import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> cards;
	
	public Deck() {
		cards = new ArrayList<>();
		
		for(Suit s : Suit.values()) {
			for(Rank r : Rank.values()) {
				cards.add(new Card(r,s));
			}
		}
	}
	
	public int size() {
		return cards.size();
		
	}
	
	public String toString() {
		return cards.toString();
		
	}
	
	public Card draw() {
		if(cards == null) {
			return null;
		}
		if(cards.isEmpty()) {
			return null;
		}
		//OLD CODE
		
//		Card i;
//		i = cards.get(0);
//		cards.remove(0);
//		return i;
		
		return cards.remove(0);
	}
	
	public List<Card> draw(int count){
		List<Card> removedCards = new ArrayList<>();
		if(count >= cards.size()) {	
			for(int i = 0; i < count; i++) {
				Card c = cards.remove(i);
				removedCards.add(c);
			}
		}
		if(count <= 0) {
			cards.clear();
			return cards;
		}
		else {
			for(int i = 0; i < count; i++) {
				Card c = cards.remove(i);
				removedCards.add(c);
			}
		}
		return removedCards;
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public List<Card> getCardsByRank(Rank rank){
		List<Card> rCard = new ArrayList<>();
		for(Card c : cards) {
			if(c.getRank().equals(rank)) {
				rCard.add(c);
			}
		}
		return rCard;
	}
}
