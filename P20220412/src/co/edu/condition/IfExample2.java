package co.edu.condition;

import java.util.Scanner;

public class IfExample2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int num = s.nextInt();
		
		System.out.printf("입력하신 숫자는 %d입니다.%n",num);
				
		if(num % 2 == 0 && num % 3 == 0) {
			System.out.println("2,3의 공통 배수입니다.");
		} else if ((num % 2 == 0) && (!(num % 3 == 0))) {
			System.out.println("2의 배수입니다.");
		} else if ((num % 3 == 0) && (!(num % 2 == 0))) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("2와 3의 배수가 아닙니다.");
		}

		
	}
}
