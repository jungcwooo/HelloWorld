package co.edu.variable;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
				
		
		Scanner scn = new Scanner(System.in);
		System.out.println("섭씨면 c, 화씨면 f를 입력하세요");
		String t1 = scn.next();
		char t = t1.charAt(0); // char 은 따로 String으로 뽑아낸뒤 charAt으로 char을 뽑는다.
		
		if (t == 'c') {
			System.out.println("섭씨 온도를 입력하세요");
			Scanner scn1 = new Scanner(System.in);
			double f = scn1.nextDouble();
			double c = (5/9.0*(f-32));
			System.out.printf("화씨 온도는 %.1f도입니다",c);
		}
		else if( t == 'f') {
			System.out.println("화씨 온도를 입력하세요");
			Scanner scn2 = new Scanner(System.in);
			double c = scn2.nextDouble();
			double f = ((c * 9.0/5) + 32);
			System.out.printf("섭씨 온도는 %.1f도입니다",f);
		}
		else 
			System.out.println("잘못 입력하셨습니다.");
		
//		System.out.printf("온도는 %.1f",c);
//		if() {
//		System.out.println("온도를 입력하세요");		f
	}
		

}
