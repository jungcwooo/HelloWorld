package co.edu.variable;

import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("첫번째 숫자 입력하세요");
		num1 = scanner.nextInt();
		System.out.println("두번째 숫자 입력하세요");
		num2 = scanner.nextInt();
		
		
		int result;
		if(num1>num2) {
			result = num1 - num2;
		} else
			result = num2 - num1;
		
		System.out.println("두 수의 차이는 "+result+"입니다.");
	}

}
