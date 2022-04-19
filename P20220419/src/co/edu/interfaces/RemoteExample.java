package co.edu.interfaces;

public class RemoteExample {
	public static void main(String[] args) {
		
		// 인터페이스는 객체를 만들 수 없다
		RemoteControl rc = new Television(); // 인터페이스를 구현한 객체를 생성해 인터페이스의 리모컨으로 사용할 수 있다.
		
		rc.turnOff();
		
		
		rc = new Audio();
		
		rc.turnOff();
		
		RemoteControl.changeBattery();
		// 꼭 객체를 구현하지 않아도 사용할수있는 메서드
	}
}
