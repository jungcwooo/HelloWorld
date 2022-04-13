package co.edu.condition;

import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요 ( 1 ~ 6 )");

		int my = scn.nextInt();
		int dice = (int) (6 * (Math.random()) + 1);

		if (my == dice) {
			System.out.println("입력하신 값은 " + my + "입니다");
			System.out.println("나온 주사위의 눈은 " + dice + "입니다");
			System.out.println("같습니다.");
		} else {
			System.out.println("입력하신 값은 " + my + "입니다");
			System.out.println("나온 주사위의 눈은 " + dice + "입니다");
			System.out.println("다릅니다.");

		}
	}
}
