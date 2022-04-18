package co.edu.brain;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		int[] number = new int[5];
		int[] number1 = new int[5];
		;

		for (int i = 0; i < number.length; i++) {
			number[i] = (int) (5 * (Math.random()) + 1);

			for (int j = 0; j < i; j++) {
				if (number[i] == number[j]) {
					i--;
					break;
				}
			}

		}
		Scanner scn = new Scanner(System.in);

		System.out.println("==============================================");
		System.out.println("1 ~ 5의 숫자 중 5가 들어있는 위치를 찾는 게임!");
		System.out.println("==============================================");
		for (int i = 0; i < number.length; i++) {
			System.out.print("[*]");
		}
		System.out.println();
		System.out.print("숫자를 입력해주세요! => ");

		while (true) {

			int nem = Integer.parseInt(scn.next());
			int x = (nem - 1);

			System.out.println();
			for (int i = 0; i < number.length; i++) {
				if (5 == number[x]) {
					System.out.println("정답입니다.");
					break;

				}
			}
			System.out.println("틀렸습니다.");
			System.out.println();
		}
	}
}
