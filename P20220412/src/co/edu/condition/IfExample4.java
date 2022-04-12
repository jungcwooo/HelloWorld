package co.edu.condition;

import java.util.Arrays;
import java.util.Scanner;

public class IfExample4 {
	public static void main(String[] args) {

		int ro = (int) (45 * (Math.random()) + 1);
		// 1~45 사이의 난수

		int[] lotto = new int[6];

		for (int i = 0; i < 6; i++) {
			lotto[i] = (int) (45 * (Math.random()) + 1);

			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}

		}
		Arrays.sort(lotto);

		System.out.println(Arrays.toString(lotto));

//		int x = (int) (50 * (Math.random()) + 1);
//		int y = (int) (10 * (Math.random()) + 51);
//		int z = (int) (10 * (Math.random()) + 61);
//		int g = (int) (10 * (Math.random()) + 71);
//		int b = (int) (10 * (Math.random()) + 81);
//
//		System.out.printf("%d, %d, %d, %d, %d", x, y, z, g, b);

	}
}
