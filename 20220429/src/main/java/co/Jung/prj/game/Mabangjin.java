package co.Jung.prj.game;

import java.util.Arrays;
import java.util.Scanner;

public class Mabangjin {

	public void mabangjin() {
		Scanner scn = new Scanner(System.in);
		System.out.println("홀수를 입력해주세요");
		int x = Integer.parseInt(scn.next());
		;
		int[][] mabang = new int[x][x];

		for (int i = 0,  j = (x/2), num = 1; num <= x * x; num++) {
			mabang[i][j] = num;
			if (num % x == 0) {
				i++;
			} else {
				i--;
				j++;
				if (i < 0) {
					i = x - 1;
				}
				if (j > (x - 1)) {
					j = 0;
				}
			}
		
		}
		for (int a= 0; a < mabang.length; a++) {
			int[] inArr = mabang[a];
			for (int b = 0; b < inArr.length; b++) {
				System.out.printf("[%2d]",inArr[b]);
			}
			System.out.println();
		}
		

	}
	

	public void run() {
		mabangjin();
	}
}
