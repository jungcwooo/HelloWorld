package co.edu;

public class OperatorExample4 {

	public static void main(String[] args) {
		int num = 11;
		String msg = "";
//		if(num % 2 == 0) {
//			msg = "짝수입니다.";
//		}
//		else {
//			msg = "홀수입니다.";
//		}
		
		msg = (num % 2 == 0) ? "짝수입니다." : "홀수입니다.";
		//삼항연산자를 잘쓰면 유용하다.
		
		System.out.println(num + "은 " + msg);
	
	
	}
}
