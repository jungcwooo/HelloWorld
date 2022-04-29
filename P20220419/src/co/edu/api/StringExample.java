package co.edu.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StringExample {
	public static void main(String[] args) {
		// 주민번호 => 생년월일 - 남/여 구분.

		// 950405-2345678 => 95년생 4월 5일생 여자
		// 처음에 주민등록 번호를 입력하세요
		// 스트링 타입의 스케너
		
		Scanner scn = new Scanner(System.in);
		String resuelt ="";
		System.out.println("주민등록번호를 입력하세요");
		try {
			resuelt = checkInfo(scn.next());
			
		} catch (Exception e) {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		System.out.println(resuelt);

//		
		System.out.println();

	}

	public static String checkInfo(String jumin) {

		String intStr = jumin.replaceAll("-", "");

		int yy = Integer.parseInt(intStr.substring(0, 2));
		int mm = Integer.parseInt(intStr.substring(2, 4));
		int dd = Integer.parseInt(intStr.substring(4, 6));
		int gender = Integer.parseInt(intStr.substring(6, 7));
		String sex = "";

		LocalDate ldate = LocalDate.of(yy, mm, dd);
		LocalDateTime ldatetTime = LocalDateTime.now();
		int nowyy = ldatetTime.getYear() - 2000;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy년 M월 d일 생, "); // 출력 패턴 입력
		if (yy > nowyy && yy <= 99) {
			if (gender == 1) {
				sex = "남자";
			} else if (gender == 2) {
				sex = "여자";
			} else {
				return "잘못 입력하셨습니다.";
			}
		} else if (yy >= 0 && yy <= nowyy) {
			if (gender == 3) {
				sex = "남자";
			} else if (gender == 2) {
				sex = "여자";
			} else {
				return "잘못 입력하셨습니다.";
			}
		} else {
			return "잘못 입력하셨습니다.";

		}
		return yy + "년 " + mm + "월 " + dd + "일, " + sex + "입니다.";
	}
}
