package co.edu.loop;

import java.util.Scanner;

public class NestedExample {
	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//		System.out.println("구구단 계산기");
//		System.out.println("숫자를 입력하세요");
//		int dan = scn.nextInt();
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i+" * "+j+" = "+i*j);
		}
			System.out.println();
			System.out.println("###########");
			System.out.println();
		}
	}
}
