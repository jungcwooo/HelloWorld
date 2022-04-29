package co.Jung.prj.menu;

import java.util.Scanner;

import co.Jung.prj.game.*;

public class Menu {
	private Scanner scn = new Scanner(System.in);

	private void mainTitle() {
		System.out.println("========================");
		System.out.println("===  게  임  모  음  ===");
		System.out.println("=== 1. 로 또 게 임   ===");
		System.out.println("=== 2. 마  방  진    ===");
		System.out.println("=== 3. 테 트 리 스   ===");
		System.out.println("=== 4. 게 임 종 료   ===");
		System.out.println("========================");
		System.out.println("   게임을 선택하세요");
	}

	private void mainMenu() {
		boolean b = true;
		do {
			mainTitle();
			int key = Integer.parseInt(scn.next());
			switch (key) {
			case 1: //로또
				Lotto lo = new Lotto();
				lo.run();
				break;
			case 2:	//마방진
				Mabangjin ma = new Mabangjin();
				ma.run();
				break;
			case 3:	//테트리스
				Tetris te = new Tetris();
				te.run();
				break;
			case 4:	//종료
				System.out.println("게임모음을 종료하겠습니다.");
				scn.close();
				b = false;
				break;
			default:
				System.out.println("잘못 입력 하셨습니다.");
				scn.close();
				break;
			}
		} while (b);
		scn.close();
	}

	public void run() {
		mainMenu();
	}
}
