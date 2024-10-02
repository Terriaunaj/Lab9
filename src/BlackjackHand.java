import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BlackjackHand {

		
	private static final Map<Rank, Integer> CARD_VALUES;
	static {
		CARD_VALUES = new HashMap<Rank,Integer>();
	}
	private static int MAX_VALUE = 21;
	
	private List<Card> cards = new ArrayList<>();
	private int value = 0;
	private int numAcesAs11 = 0;
	
	public BlackjackHand(Card c1, Card c2) {
		cards.add(c1);
		cards.add(c2);
		
		//OLD CODE
		
//		cards = new ArrayList<Card>();
//		cards.add(c1);
//		cards.add(c2);
//		
//		int c1Value = CARD_VALUES.get(c1.getRank());
//		int c2Value = CARD_VALUES.get(c2.getRank());
//		value = c1Value + c2Value;
//		if(c1.getRank() == Rank.ACE) {
//			numAcesAs11++;
//		}
//		if(c2.getRank() == Rank.ACE) {
//			numAcesAs11++;
//		}
	}
	
	public void addCard(Card card) {
		if(card == null && !(getValue() > 21)) {
			throw new NullPointerException();
		}
		if(getValue()< MAX_VALUE && !(getValue() > 21)) {
			cards.add(card);
			value++;
		}
		if(getValue() == 11) {
			numAcesAs11++;
		}
		
		//OLD CODE
		
//		if(card == null) {
//			throw new NullPointerException();
//		}
//		else if(value < MAX_VALUE) {
//			cards.add(card);
//		}
//		else if(value == 1 || value == 11) {
//			numAcesAs11++;
//		}
	}
	
	public int size() {
		return cards.size();
		
	}
	
	public static Map<Rank, Integer> getCardValues(){
		Map<Rank, Integer> copy = new HashMap<Rank, Integer>(CARD_VALUES);
		//OLD CODE
		
		//Map<Rank, Integer> copy = new HashMap<>();
		//copy.putAll(CARD_VALUES);
		return copy;
		
	}
	
	public List<Card> getCards(){
		List<Card> newList = new ArrayList<>(cards);
		//OLD CODE
		
		//return List.copyOf(cards);
		return newList;
		
	}
	
	public int getValue() {
		if(value > MAX_VALUE && value == 1) {
			return value;
		}
		//OLD CODE
		//says just to return value
		return value;
	}
	
	public String toString() {
		return cards.toString();
		
	}
}
