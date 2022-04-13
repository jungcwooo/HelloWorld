package co.edu;

public class ReferenceExam {
	public static void main(String[] args) {
		
		int a = 100;
		int b = 100;
		
		if (a == b) {
			System.out.println("같다!");
		} else {
			System.out.println("다른데?");
		}
		
		String str1 = new String("홍길동");
		String str2 = new String("홍길동");
		// new 연산자를 사용할 경우 매번 새로운 객체가 만들어진다.
		// 주소값이 다름
		
		str1 = "김길동";
		str2 = "김길동";
		// 직접 저장할 경우 같은 객체가 들어간다.
		
		if (str1 == str2) {					// ==는 참조변수의 주소를 비교하는 것
			System.out.println("같다!");
		} else {
			System.out.println("다른데?");
		}
		
		if (str1.equals(str2)) {			// 참조변수에 저장된 값을 비교하려면 equals()를 사용
			System.out.println("같다!");
		} else {
			System.out.println("다른데?");
		}
	
	}
}
