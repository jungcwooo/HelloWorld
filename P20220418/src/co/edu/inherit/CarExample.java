package co.edu.inherit;

public class CarExample {
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.model = "45인승 버스";
		bus.drive();
		bus.stop();
		
		bus.nember = "158";
		bus.fee();
		
		Taxi taxi = new Taxi();
		
		taxi.model = "쏘나타";
		taxi.drive();
		
		taxi.type = "개인택시";
		taxi.metering();
		
		// 자식 클래스의 인스턴스는 부모클래스의 참조변수에 할당이가능하다 (다형성)

		Bus[] Buses = new Bus[10];
		Taxi[] taxies = new Taxi[10];
		
		Car[] cars = new Car[10];
		cars[0] = bus; //자동 형변환
		cars[1] = taxi;
		
		
		System.out.println(taxi.toString());
		System.out.println(bus.toString());
		
	}
}
