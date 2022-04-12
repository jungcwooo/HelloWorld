package co.edu.loop;

import java.util.Scanner;

public class WhileExample2 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int sum = 0;

		boolean isTrue = true;


		while (isTrue) {
			System.out.println("숫자를 입력하세요");
			int num = scn.nextInt();
			sum += num;
			if (sum <= 200) {
				System.out.println("더하기 : " + sum);
				continue;
			} 
			isTrue = false;
		}
			System.out.println("결과 : " + sum);
	}
}
