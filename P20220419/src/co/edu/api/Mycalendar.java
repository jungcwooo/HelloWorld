package co.edu.api;

import java.util.Calendar;
import java.util.Scanner;

public class Mycalendar {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int y = Integer.parseInt(scn.next());
		int m = Integer.parseInt(scn.next());

		showCal(y, m);
	}

	public static void showCal(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);
		int dd = cal.getActualMaximum(Calendar.DATE);
		int week1 = cal.get(Calendar.DAY_OF_WEEK); // 1~7 요일 1: 일

		System.out.println(week1);
		String[] week = { "Sun", "Mon", "Tru", "Wed", "Thr", "Fri", "Sat" };
		System.out.println("          " + year + "년 " + month + "월 달력");

		for (String string : week) { // 요일 출력
			System.out.printf("%5s", string);
		}
		System.out.println();

		for (int i = 0; i < week1 - 1; i++) { //공백 출력
			System.out.printf("%5s", " ");
		}
		
		for (int i = 1; i <= dd; i++) {

			System.out.printf("%5d", i);
			if ((i+week1) % 7 == 1) {
				System.out.println();
			}
		}

	}
}
