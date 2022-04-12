package co.edu.loop;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scn = new Scanner(System.in);
		int money = 0;

		while (run) {
			System.out.println();
			System.out.println("--------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("--------------------------------------");
			System.out.print("선택 > ");

			int user = scn.nextInt();
			if (user == 1) {
				System.out.println("금액을 투입해주세요.");
				money = scn.nextInt();
				balance += money;
				System.out.println("예금액 : " + money);
			} else if (user == 2) {
				System.out.println("얼마를 빼시겠습니까?.");
				money = scn.nextInt();
				if (money > balance) {
					System.out.println("금액이 부족합니다.");
//					run = false;
				} else {
					balance -= money;
					System.out.println("출금액 : " + money);
				}
			} else if (user == 3) {
				System.out.println("잔고 : " + balance);
			} else if (user == 4) {
				System.out.println("프로그램 종료");
				run = false;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}

		}
	}

}
