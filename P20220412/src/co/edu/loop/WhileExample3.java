package co.edu.loop;

import java.util.Scanner;

public class WhileExample3 {
	public static void main(String[] args) {

		
		boolean isTrue = true;
		
		int num = (int)(10* (Math.random())+1);
		System.out.println("숫자를 입력하세요");
		while(isTrue) {
			Scanner scn = new Scanner(System.in);
			int user = scn.nextInt();
			System.out.println("사용자가 입력한 값 : "+user);
			if(user > num) {
				System.out.println("입력한 값이 큽니다");
			} else if(user < num) {
				System.out.println("입력한 값이 작습니다");
			} else if(user == num) {
				System.out.println("정답입니다!");
				break;
			}
		} 

		
	}
}
