package co.edu.myself;

import java.util.Scanner;

public class BankExe {

	static BankList bank = new BankList();;
	static BankList[] bab = new BankList[5];;

	public static void main(String[] args) {
		int number = 1;
		while (true) {
			int menu = 0;
			System.out.println("1. 계좌 개설 | 2. 입금 | 3. 출금 | 4. 전체 회원 목록 | 9. 종료");
			Scanner scn = new Scanner(System.in);
			menu = Integer.parseInt(scn.nextLine());
			if (menu == 1) {
				System.out.println("계좌를 개설합니다.");
				System.out.println("이름,비밀번호,초기금액을 입력해주세요");
				String bName = scn.nextLine();
				int bPass = Integer.parseInt(scn.nextLine());
				int bMoney = Integer.parseInt(scn.nextLine());

				BankList bankP = new BankList(bName, number, bPass, bMoney);

				for (int i = 0; i < bab.length; i++) { // 개좌 개
					 if (bab[i] == null) {
						bab[i] = bankP;
						number++;
						System.out.println("계좌 개설이 완료되었습니다.");
						System.out.println(bab[i].getName() + "님의 계좌번호는 " + bab[i].getNember() + "입니다.");
						break;
					}
				}

			} else if (menu == 2) {// 입금
				System.out.println("입금할 계좌번호를 입력해주세요.");
				int bNumber = Integer.parseInt(scn.nextLine());
				for (int i = 0; i < bab.length; i++) {
					if (bab[i] != null && bab[i].getNember() == bNumber) {
						System.out.println(bab[i].getName() + "님의 계좌에 입금할 금액을 입력해주세요");
						int bMoney = Integer.parseInt(scn.nextLine());
						bab[i].setMoney(bab[i].getMoney() + bMoney);
						System.out.println("입금에 성공하였습니다.");
						break;
					} else {
						System.out.println("입금에 실패하였습니다.");
						break;
					}
				}

			} else if (menu == 3) {// 출금
				System.out.println("출금할 계좌번호를 입력해주세요.");
				int bNumber = Integer.parseInt(scn.nextLine());
				for (int i = 0; i < bab.length; i++) {
					if (bab[i] != null && bab[i].getNember() == bNumber) {
						for (int j = 0; j < bab.length; j++) {
							System.out.println("비밀번호를 입력하세요");
							int bPass = Integer.parseInt(scn.nextLine());
							if (bab[i].getPasswd() == bPass) {
								System.out.println(bab[i].getName() + "님의 계좌에서 출금할 금액을 입력해주세요");
								int mMoney = Integer.parseInt(scn.nextLine());
								if ((bab[i].getMoney() - mMoney) >= 0) {
									bab[i].setMoney(bab[i].getMoney() - mMoney);
									System.out.println("출금에 성공하였습니다.");
									break;
								} else {
									System.out.println("금액이 부족합니다.");
								}
							} else {
								System.out.println("비밀번호가 다릅니다.");
								break;
							}
						}
						break;
					} else {
						System.out.println("입금에 실패하였습니다.");
						System.out.println("계좌번호가 없습니다.");
						break;
					}
				}
			} else if (menu == 4) {// 조회
				System.out.println("회원들의 목록을 불러옵니다.");
				System.out.println("계좌번호 이름 금액");
				for (int i = 0; i < bab.length; i++) {
					if (bab[i] != null)
						System.out.printf("%5d  %4s  %13d \n", bab[i].getNember(), bab[i].getName(), bab[i].getMoney());
					
				}

			} else if (menu == 9) {
				System.out.println("앱을 종료합니다.");
				System.exit(number);
			} else {
				System.out.println("잘못 입력 하셨습니다.");

			}
		}
	}

	public static void searchBank() {
		System.out.println("회원들의 목록을 불러옵니다.");
		System.out.println("계좌번호 이름 금액");
		System.out.printf("%5d  %4s  %13d \n", bank.getNember(), bank.getName(), bank.getMoney());
	}

	public static BankList[] searchbank() {
		return bab;
	}

}
