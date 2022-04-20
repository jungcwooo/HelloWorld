package co.edu.nested;

public class Outer {
	private String f1;
	
	// 인스턴스 멤버클래스
	class Inner1 {
		String f2;
		
		void method2() {
			System.out.println("method2() call");
		}

	}
	// 스테틱 멤버클래스
	static class Inner2 {
		String f4;
		static String f5;
		
		void method4() {
			System.out.println("method4() call");
		}
		
		static void method5() {
			System.out.println("method5() call" + f5);
		}
	}
	
	public void method1() {
		System.out.println("method1() call");
		
		class Local{
			String f3;
			
			void method3() {
				System.out.println("method3() call");

			}
		}
		
		Local local = new Local();
		local.method3();
	}
}

