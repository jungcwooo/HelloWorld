package co.edu.inherit;

public class Bus extends Car {
	String nember;
	
	public Bus() {
		super();
		System.out.println("Bus() 생성자 호출");//부모와 자식간의 관계에서는 super는 부모를 뜻한다
	}				// super()는 부모의 생성자를 호출
	
	public void fee() {
		System.out.println("요금을 받습니다.");
	}
	
	@Override
	public void drive() {	//오버라이딩 같은 메서드를 구현부만 다르게
		System.out.println("버스가 운행을 합니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.stop();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "버스의 번호는 " + nember +"이고 모델은 "+ super.model;
//		return super.toString();
	}
}
