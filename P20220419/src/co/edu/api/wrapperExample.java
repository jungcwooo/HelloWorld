package co.edu.api;

public class wrapperExample {
	public static void main(String[] args) {

	
	// 랩퍼클래스
	// 기본데이터-> 참조데이터
	// int, long, byte, float -> Integer, Long, Byte, Float
		int n1 = 100;
//		Integer n2 = new Integer(256);	//자동박싱
		Integer n2 = 256;				//자동박싱
		n1 = n2;						//언박싱
		
		
		byte b1 = n2.byteValue();
		System.out.println(b1);

		
		Float f1 = 20.2F;
		
		n1 = Integer.parseInt("100");
		b1 = Byte.parseByte("50");
		
		System.out.println(n1);
		System.out.println(b1);
	}
}
