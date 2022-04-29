package co.Jung.card;

public class MainApp {
	public static void main(String[] args) {
		int price = 10000;
		
		Payment card = new CardPayment(0.08);
		card.showInfo();
		System.out.println("온라인 결제 금액 : "+ card.online(price));
		System.out.println("오프라인 결제 금액 : "+ card.offline(price));
		
		System.out.println("===================================================");
		
		Payment simple = new SimplePayment(0.05);
		simple.showInfo();
		System.out.println("온라인 결제 금액 : "+ simple.online(price));
		System.out.println("오프라인 결제 금액 : "+ simple.offline(price));
		
		System.out.println("===================================================");
		
		Card cardDGBuser = new DGBCard("1564-565-41516-51", "20280405", 232, "정철우");
		cardDGBuser.showCardInfo();
		
		System.out.println("===================================================");
		
		Card cardTossuser = new TossCard("6841-45-45815-555", "20240811", 456, "박철우");
		cardTossuser.showCardInfo();
	}
}
