package co.edu;

// 객체 > 도면 > 텔레비전
// object > Class > Instance.
// 추상화(텔레비전의 모든속성 > 필요한 부분)
public class Television {

	String company;
	String model;
	String color;
	int price;;

	boolean power = false;
	int chanel;

	// 메소드는 (반환유형, 메소드명, 매개변수)
	void turnOn() {
		power = true;
		System.out.println("텔레비전을 켭니다.");
	}

	void turnOff() {
		if (power == true) {
			power = false;
			System.out.println("텔레비전을 끕니다.");
		}else {
			System.out.println("-");
		}
	}

	void changeChanel(int chanel) {
		if (power == true) {
			this.chanel = chanel;
			System.out.println("채널을 " + chanel + "채널로 변경합니다.");
		} else {
			System.out.println("-");
		}
	}

}
