package card;

public class CardCompany {
	public static int cardID = 10000;

	private static CardCompany instance = new CardCompany();
	private CardCompany() {}
	
	public static CardCompany getInstance() {
		if(instance == null) {
			instance = new CardCompany();
		}
		return instance;
	}
	
	public Card creatCard() {
		Card card = new Card(cardID++);
		return card;
	}
	
}
