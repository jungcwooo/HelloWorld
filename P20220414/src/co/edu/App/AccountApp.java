package co.edu.App;

import java.util.Scanner;

public class AccountApp {
	private Account[] acc;
	private Account acc1;
	Scanner scn = new Scanner(System.in);

	public void init(int size) {
		Account[] accounts = new Account[size];
		acc = new Account[size];

	}

	public void execute() {
		while (true) {
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 입금 | 4. 출금 | 5. 종료");
			System.out.println("선택 => ");
			int menu = -1;
			menu = Integer.parseInt(scn.nextLine());
			if (menu == 1) {

				createAccount();
			} else if (menu == 2) {

				accountList();
			} else if (menu == 3) {

				deposit();
			} else if (menu == 4) {
				withdraw();
			} else if (menu == 5) {
				System.out.println("앱을 종료합니다.");
				break;
			} else {
				System.out.println("앱을 종료합니다.");
				break;
			}
		}

	}

	// 계좌생성
	public void createAccount() {

		System.out.println("=======================================");
		System.out.println("           계좌를 생성합니다.");
		System.out.println("=======================================");
		System.out.print("계좌번호 => ");
		String bNumber = scn.nextLine();
		System.out.print("예금주 => ");
		String bName = scn.nextLine();
		System.out.print("금액 => ");
		int mo = Integer.parseInt(scn.nextLine());
		System.out.print("비밀번호 => ");
		int pass = Integer.parseInt(scn.nextLine());

		Account newAcc = new Account(bNumber, bName, mo, pass);

		int chk = addBankNum(newAcc);

		if (chk == 0) {
			System.out.println("완료되었습니다.");
		} else if (chk == -1) {
			System.out.println("저장 공간이 부족합니다.");
		} else if (chk == 1) {
			System.out.println("중복된 게시물 번호입니다.");
		}

	}

	// 입금처리
	public void deposit() {
		System.out.println("입금할 계좌번호를 입력하세요");
		String sandNum = scn.nextLine();
		for (int i = 0; i < acc.length; i++) {
			if (acc[i] != null && acc[i].getBankNumber().equals(sandNum)) {
				System.out.println("입금할 금액을 입력하세요");
				int sandMoney = Integer.parseInt(scn.nextLine());
				int mmm = (acc[i].getMoney() + sandMoney);
				acc[i].setMoney(mmm);
				System.out.println("성공적으로 입금되었습니다.");
				break;
			} else {
				System.out.println("입금에 실패하였습니다.");
				continue;
			}
		}

	}

	// 출금처리
	public void withdraw() {
		System.out.println("출금할 계좌번호를 입력하세요");
		String giveNum = scn.nextLine();
		for (int i = 0; i < acc.length; i++) {
			if (acc[i] != null && acc[i].getBankNumber().equals(giveNum)) {
				System.out.println("출금할 금액을 입력하세요");
				int giveMoney = Integer.parseInt(scn.nextLine());
				if ((acc[i].getMoney() - giveMoney) >= 0) {
					int xxx = (acc[i].getMoney() - giveMoney);
					acc[i].setMoney(xxx);
					System.out.println("성공적으로 출금되었습니다.");
					break;
				} else {
					System.out.println("잔액이 부족합니다.");
					break;
				}
			} else {
				System.out.println("계좌번호를 잘못 입력하셨습니다.");
				break;
			}

		}
	}

	// 전체목록
	public Account[] accountList() {
		System.out.println("계좌 목록을 불러옵니다.");
		System.out.println("계좌번호 예금주 금액 비밀번호");

		for (int j = 0; j < acc.length; j++) {
			if (acc[j] != null) {
				acc[j].getSearchInfo();
			}

		}
		return acc;
	}

	public int addBankNum(Account newAcc) {
		int errorCase = -1;
		for (int i = 0; i < acc.length; i++) {
			if (acc[i] != null && acc[i].getBankNumber().equals(newAcc.getBankNumber())) {
				errorCase = 1;
				break;
			}
			if (acc[i] == null) {
				acc[i] = newAcc;
				errorCase = 0;
				break;
			}

		}
		return errorCase;
	}
}
