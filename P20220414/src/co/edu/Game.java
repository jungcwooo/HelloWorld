package co.edu;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int[] n1 = { 0, 0, 0, 0, 0 };
		int[] n = new int[5];
		for (int i = 0; i < n.length; i++) {
			n[i] = (int) (5 * (Math.random()) + 1);
			for (int j = 0; j < i; j++) {
				if (n[i] == n[j]) {
					i--;
					break;
				}
			}

		}
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i]);
		}

		System.out.println();
		for (int i = 0; i < n.length; i++) {
			System.out.print("[*]");
		}

		System.out.println();
		while (true) {
			System.out.println();
			System.out.println("숫자를 입력해주세요");
			int num = Integer.parseInt(scn.next());
			System.out.println();
			int x = num - 1;
			for (int i = 0; i < n.length; i++) {
				if (n[x] == 5) {
					System.out.println("정답");
					break;
				} else {
					n1[x] = n[x];
					if (n1[i] == 0) {
						System.out.print("[*]");
					} else if (n1[i] != 0) {
						System.out.print("[" + n1[i] + "]");
					}
				}

			}
		}

	}
}
//						System.out.print("[*]");
