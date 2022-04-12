package co.edu;

import java.util.Iterator;

public class OperatorExample {

	public static void main(String[] args) {
		int num1 = 10;
		num1 += 2;
		num1 += 2;

		System.out.println(num1);

		num1 += 1;
		num1++;
		System.out.println(num1);
		System.out.println(++num1);
	
		byte num3 =10;
		num3 += 1; // 형변환이 필요없다.
		num3 = (byte)(num3 + 1); // +는 정수연산이기 때문에 오류가 난다. (형변환 필요)
		
		num3 = 125;
		System.out.println(num3);

		num3 += 3;
		System.out.println(num3);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		}
	
	}

