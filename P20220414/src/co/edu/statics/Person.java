package co.edu.statics;

public class Person {
	final String nation = "Korea"; //한번 저장하면 후에 변경 불가
	final String ssn ; 
	// 초기 값을 저장 안하면 매개변수로 저장가능 (대신 한번 지정후 변경 불가)
	static final double PI = 3.14; // 클래스에 소속되어 있고, 값을 변경할수 없다.
	String name;
	
	public Person (String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
