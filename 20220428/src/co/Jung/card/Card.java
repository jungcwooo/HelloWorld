package co.Jung.card;

public class Card {
	private String cardNo;
	private String validDate;
	private int cvc;
	
	public Card(String cardNo, String validDate, int cvc) {
		this.cardNo = cardNo;
		this.validDate = validDate;
		this.cvc = cvc;
	}

	public String getCardNo() {
		return cardNo;
	}

	
	public String getValidDate() {
		return validDate;
	}

	
	public int getCvc() {
		return cvc;
	}

	public void showCardInfo() {
		System.out.printf("Card NO : %s, 유효기간 : %s, CVC : %d", cardNo, validDate, cvc);
	}
	
	
	
}
