package co.edu.array;

import java.util.Scanner;

public class ArrayExample7 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		int month = scn.nextInt();
		System.out.println("          "+month+"월 달력");
		System.out.println();
		
		
		
		String[] day = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		// 요일배열에 요일 저장
		int lnth = getLastDay(month);
		// 배열 값 지정
		int[] intAry = new int[lnth];

		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = i + 1;
		} // 일 정보 출력

		for (int i = 0; i < day.length; i++) {
			System.out.printf("%4s", day[i]);
		} // 요일 정보 출력
		System.out.println();

		int spc = getDayInfo(month);
		// 1일의 요일을 지정해주기 위한 공백
		for (int i = 0; i < spc; i++) {
			System.out.printf("%4s", " ");
		}
		for (int i = 0; i < intAry.length; i++) {
			System.out.printf("%4d", intAry[i]);
			if ((i + spc) % 7 == 6) { // 공백을 포함한 일을 7로 나누어서 나머지값을 통해 줄바꿈 위치 지정
				System.out.println();
			} // 13+0
		}

	} // main메서드의 끝부분
	
	public static int getLastDay(int month) {
		switch (month) {
		case 1:
			return 31;
		case 2:
			return 28;
		case 3:
			return 31;
		case 4:
			return 30;
		case 5:
			return 31;
		case 6:
			return 30;
		case 7:
			return 31;
		case 8:
			return 31;
		case 9:
			return 30;
		case 10:
			return 31;
		case 11:
			return 30;
		case 12:
			return 31;
			
		default:
			return 30;
		}
	}

	public static int getDayInfo(int month) {
		switch (month) {
		case 4:
			return 5;
		case 5:
			return 0;
		case 6:
			return 3;
		case 7:
			return 5;
		case 8:
			return 1;
			
		default:
			return 0;
		}
	}
}
