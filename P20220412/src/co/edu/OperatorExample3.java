package co.edu;

public class OperatorExample3 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		if(num1 == num2) {
			System.out.println("두 수는 같습니다.");
		} 
		if(num1 != num2) {
			System.out.println("두 수는 같지 않습니다.");
		}
		if(num1 > num2) {
			System.out.println("num1이 더 큰 수입니다.");
		}
		if(num1 < num2) {
			System.out.println("num2이 더 큰 수입니다.");
		}
		if(num1 % 2 == 0 || num2 % 2 == 0) { 
			// && 와 & 의 차이점 &&은 앞에서 false 가나오면 뒤에는 실행을 안하고 바로 블럭으로 넘어간다.
			System.out.println("두 수중 하나 이상이 짝수 입니다.");
		} else {
			System.out.println("두 수가 홀수 입니다.");
		}
		System.out.println("끝");
	}

}
