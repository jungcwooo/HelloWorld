package co.edu.interfaces;

public interface RemoteControl {
	// 인터페이스는 원래 추상적이기 때문에 abstreact를 생략 시킬 수 있다.
	// 인터페이스에서 변수를 선언할때에는 상수만 가능하다.
	public static final int MAX_VOLUM = 10;

	public void turnOn();

	public void turnOff();

	public void volumUp();

	public void volumDown();

	public default void justScreen() {
		System.out.println("화면을 조정합니다");
		// 디폴트 메서드를 통해서 이 인터페이스를 구현한 클래스에서 꼭 사용하지 않아도 되게끔
		// 오버라이딩을 통해 기능을 사용할 수 있도록 해주는 기능
	}

	public static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
		// 꼭 객체를 구현하지 않아도 사용할수있는 메서드
	}
}
