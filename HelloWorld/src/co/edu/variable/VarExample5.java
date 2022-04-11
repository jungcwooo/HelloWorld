package co.edu.variable;

public class VarExample5 {
	public static void main(String[] args) {
//		int val1 = 2147483647;	// 4 * 1byte => 1byte = 8 * bit; 값이 on/off
		long val2 = 2147483648L;
		long val3 = 10;
		int val4 = (int) 2147483647L + 2147483647 + 2;
		
 
		
		int result = (int) 10000000000L / 5;
		
		long val5 = 10000000000L;
		long val6 = 10L;
		
		result = (int) (val5 - val6);
		
		
		
		
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
		System.out.println(result);

		
		char charLit = 97;
		System.out.println(charLit);
		charLit = 44032;
		System.out.println(charLit);
		
		for(int i=0; i< 10; i++) {
			System.out.println(charLit++);
		}
		
		
	}

}
