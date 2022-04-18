package co.edu.statics;
// 여러 사람이 작업할때 메모리를 아끼기 위해 사용
public class Singleton {
	
	private static int num = 1;
	
	private static Singleton singleton = new Singleton();
	// 클래스 자신의 객체를 하나만든다.
	private Singleton() { 
		// 생성자에서 public 대신 private로 생성자 사용 제한
		
	}
	
	public static Singleton getInstance() {
		return singleton;
		// getInstance() 라는 메서드를 이용해서 singleton 클래스를 사용할수있음
	}


	static void getnin() {
		System.out.println(num);
	}
	static void seynin(int x) {
		num = x;
	}
	
	
}
