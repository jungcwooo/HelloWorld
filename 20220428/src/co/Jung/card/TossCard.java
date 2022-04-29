package co.Jung.card;

public class TossCard extends Card {
	final String company = "Toss";
	String cardStaff;

	public TossCard(String cardNo, String validDate, int cvc, String cardStaff) {
		super(cardNo, validDate, cvc);
		this.cardStaff = cardStaff;
	}

	public void showCardInfo() {
		System.out.printf("카드정보 - Card NO, %s \n" + "담당직원 - %s, %s\n", getCardNo(), cardStaff, company);
	}

}
