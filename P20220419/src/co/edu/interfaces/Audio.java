package co.edu.interfaces;

public class Audio implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	@Override
	public void volumUp() {
		System.out.println("Audio의 음량을 올립니다.");
	}
	@Override
	public void volumDown() {
		System.out.println("Audio의 음량을 내립니다.");
	}
}
