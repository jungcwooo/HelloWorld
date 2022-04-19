package co.edu.interfaces;

// 인터페이스를 구현한 클래스를 통해서 인터페이스의 기능을 사용할 수 있다. 
public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("Tv를 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("Tv를 끕니다.");
	}
	@Override
	public void volumUp() {
		System.out.println("Tv 음량을 올립니다.");
	}
	@Override
	public void volumDown() {
		System.out.println("Tv 음량을 내립니다.");
	}
	@Override
	public void justScreen() {
//		RemoteControl.super.justScreen();
		System.out.println("화면을 조정합니다");
	}
}
