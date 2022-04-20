package co.edu.nested;

public class Main {
	public static void main(String[] args) {
		
		Outer out = new Outer();
		out.method1();
		
		
		// 인스턴스 멤버클래스
		Outer.Inner1 inner1 = out.new Inner1();
		inner1.method2();
		
		// 스테틱 멤버클래스
		Outer.Inner2.f5 = "ㅋㅋ";
//		Outer.Inner2.method4(); // 스테틱이 아니라 호출 불가
		Outer.Inner2.method5();
		
		Outer.Inner2 inner2 = new Outer.Inner2();
		inner2.method4();
		inner2.method5(); // 굳이 이렇게 사용하지 않아도 된다.`
	
	}
}
