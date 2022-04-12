package co.edu.loop;

import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("구구단 계산기");
		System.out.println("숫자를 입력하세요");
		int num = scn.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(num+" * "+i+" = "+num*i);
		}
		System.out.println("---------------------");
		
		for (int i = 9; i >= 1; i--) {
			System.out.println(num+" * "+i+" = "+num*i);
		}	
	}
}
