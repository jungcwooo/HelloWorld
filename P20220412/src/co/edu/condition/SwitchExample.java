package co.edu.condition;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("피자의 종류를 입력하세요");
		String i = scn.nextLine();
		int price = 0;
		
		switch(i) {
		case "하와이안" : price = 10000; System.out.printf("선택하신 피자는 %s 피자, 가격은 %d입니다.",i,price); break;
		case "불고기"	: price = 11000; System.out.printf("선택하신 피자는 %s 피자, 가격은 %d입니다.",i,price); break;
		case "포테이토"	: price = 12000; System.out.printf("선택하신 피자는 %s 피자, 가격은 %d입니다.",i,price); break;
		case "쉬림프"	: price = 15000; System.out.printf("선택하신 피자는 %s 피자, 가격은 %d입니다.",i,price); break;
		default : System.out.printf("잘못입력하셨습니다. %n"); break;
		}
		
		
	}

}
