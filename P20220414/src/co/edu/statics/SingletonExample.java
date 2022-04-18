package co.edu.statics;

public class SingletonExample {
	public static void main(String[] args) {
//		Singleton n = new Singleton();
		// private으로 생성자를 제한했기 때문에 사용 불가
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		// 이렇게 하면 내용도 공유하나?
		s1.getnin();
		s1.seynin(8);
		s1.getnin();
		System.out.println("============");
		s2.getnin();
		s2.seynin(5);
		s2.getnin();
		System.out.println("============");
		
		Singleton.getnin();
		
		
		
//		if (s1 == s2) {
//			System.out.println("같다");
//		} else {
//			System.out.println("같다");
//		}
	}
}
