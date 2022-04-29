package co.Jung.card;

public class SimplePayment implements Payment {
	double simplePaymentRatio;

	public SimplePayment(double simplePaymentRatio) {
		this.simplePaymentRatio = simplePaymentRatio;
	}

	public int online(int price) {
		return (int) (price - ((ONLINE_PAYMENT_RATIO + simplePaymentRatio) * price));

	}

	public int offline(int price) {
		return (int) (price - ((OFFLINE_PAYMENT_RATIO + simplePaymentRatio) * price));
	}

	public void showInfo() {
		System.out.println("*** 간편결제 시 할인 정보");
		System.out.println("온라인 결제 시 총 할인율 : " + (ONLINE_PAYMENT_RATIO + simplePaymentRatio));
		System.out.println("오프라인 결제 시 총 할인율 : " + (OFFLINE_PAYMENT_RATIO + simplePaymentRatio));

	}

}
