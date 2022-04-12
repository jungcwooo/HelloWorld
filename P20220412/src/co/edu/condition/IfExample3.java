package co.edu.condition;

import java.util.Scanner;

public class IfExample3 {
	public static void main(String[] args) {
		// 중첩 구문.

		Scanner scn = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = scn.nextInt();

		if (score >= 90) {
			System.out.print("A");
			if (score >= 95) {
				System.out.print("+");
			}
		} else if (score >= 80) {
			System.out.print("B");
			if (score >= 85) {
				System.out.print("+");
			}
		} else if (score >= 70) {
			System.out.print("C");
			if (score >= 75) {
				System.out.print("+");
			}
		} else {
			System.out.print("F");
		}
		System.out.println(" 학점입니다.");
	}

}
