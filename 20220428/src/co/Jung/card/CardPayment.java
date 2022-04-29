package co.Jung.card;

public class CardPayment implements Payment {
	double cardRatio;

	public CardPayment(double cardRatio) {
		this.cardRatio = cardRatio;
	}

	public int online(int price) {
		return (int) (price - ((ONLINE_PAYMENT_RATIO + cardRatio) * price));

	}

	public int offline(int price) {
		return (int) (price - ((OFFLINE_PAYMENT_RATIO + cardRatio) * price));
	}

	public void showInfo() {
		System.out.println("*** 카드로 결제 시 할인 정보");
		System.out.println("온라인 결제 시 총 할인율 : " + (ONLINE_PAYMENT_RATIO + cardRatio));
		System.out.println("오프라인 결제 시 총 할인율 : " + (OFFLINE_PAYMENT_RATIO + cardRatio));

	}

}
