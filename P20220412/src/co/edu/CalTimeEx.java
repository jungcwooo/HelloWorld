package co.edu;

import java.util.Scanner;

public class CalTimeEx {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("초를 입력하세요.");
		int time = scn.nextInt();		// 초를 입력 받아 time에 저장
		int s;							// 초를 나타내는 변수
		int m;							// 분을 나타내는 변수
		int h;							// 시를 나타내는 변수
		int tmp;						// 나머지 값을 잠시 저장할 변수
		
		h = time / (60*60);				// 입력 받은 초를 한시간인 3600초로 나누어 몫을 t에 저장
		tmp = time %(60*60);			// 입력 받은 초를 3600초로 나누고 나머지를 임시 변수에 저장
		
		m = tmp / (60);					// 임시 변수에 저장된 수를 1분인 60으로 나누어 몫을 m에 저장
		s = tmp % 60;					// 임시 변수에 저장된 수를 60으로 나누고 나머지 값을 s에 저장
		
		
		System.out.printf("입력하신 %d초는 %d시 %d분 %d초입니다.",time,h,m,s);
		

	}

}
