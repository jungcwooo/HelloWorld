package co.edu.condition;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("가위~ 바위~ 보!");
		System.out.println("1 : 가위, 2 : 바위, 3 : 보");
		
		int my = scn.nextInt();
		int na = (int)(3 * (Math.random())+1);
		System.out.println("내가 낸 것 :"+ my);
		System.out.println("상대가 낸 것 :"+ na);
		
		if(my>4) {
			System.out.println("잘못 입력하셨습니다.");
		} else if(my==1 && na ==3) {
			System.out.println("당신은 이겼습니다.");
		} else if(my==3 && na == 1) {
			System.out.println("당신은 졌습니다.");
		} else if(my==na) {
			System.out.println("당신은 비겼습니다.");
		} else if(my>na) {
			System.out.println("당신은 이겼습니다.");
		} else if(my<na) {
			System.out.println("당신은 졌습니다.");
		} 
		
		
//		switch(my) {
//		case 1 : System.out.println("비겼습니다."); break;
//		case 2 : System.out.println("졌습니다."); break;
//		case 3 : System.out.println("이겼습니다."); break;
//		default : System.out.println("잘못 입력하셨습니다.");
//		}
		
	}

}
