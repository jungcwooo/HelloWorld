package co.Jung.card;

public class DGBCard extends Card {
	final String company = "대구은행";
	String cardStaff;

	public DGBCard(String cardNo, String validDate, int cvc, String cardStaff) {
		super(cardNo, validDate, cvc);
		this.cardStaff = cardStaff;
	}

	public void showCardInfo() {
		System.out.printf("카드정보 (Card NO : %s, 유효기간 : %s, CVC : %d )\n"
				+ "담당직원 - %s, %s\n", getCardNo(), getValidDate(),getCvc(), cardStaff, company);
	}

}
