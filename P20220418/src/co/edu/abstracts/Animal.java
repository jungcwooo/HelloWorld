package co.edu.abstracts;

public abstract class Animal {
	// animal() 생성자로 인스턴스 생성불가
	public Animal() {

	}

	public abstract void eat(); // 이 클래스를 상속받은 클래스는 강제로 eat()를 구현하도록
	public abstract void run(); 

}
