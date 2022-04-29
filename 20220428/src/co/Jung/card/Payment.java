package co.Jung.card;

public interface Payment {

	final double ONLINE_PAYMENT_RATIO = 0.05;
	final double OFFLINE_PAYMENT_RATIO = 0.03;

	public int online(int price);

	public int offline(int price);

	public void showInfo();
}
