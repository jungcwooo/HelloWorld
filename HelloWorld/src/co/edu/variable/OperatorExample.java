package co.edu.variable;

import java.util.Scanner;

public class OperatorExample {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		
		
//		int result	= 6 / 4;
//		int result2 = 6 % 4;
//		
//		System.out.println(result);
//		System.out.println(result2);
	
//		if (x % 2 == 0) {
//			System.out.println("짝수입니다.");	
//		} else 
//			System.out.println("홀수입니다.");	
	
		int na;
		int oman = x / 50000;
			na = x % 50000;
		int man = na / 10000;
			na = na % 10000;
		int ochun = na / 5000;
			na = na % 5000;
		int chun = na / 1000;
			na = na % 1000;
		int obac = na / 500;
			na = na % 500;
		int bac = na / 100;
			na = na % 100;
		int oship = na / 50;
			na = na % 50;
		int ship = na / 10;
			na = na % 10;
	
			System.out.println("오만원짜리 "+oman +"개, 만원짜리 "+ man +"개, 오천원짜리 "+ ochun+"개, 천원짜리 "+ chun +"개, 오백원짜리 "+ obac +"개, 백원짜리 "+bac+"개, 오십원짜리 " + oship+"개, 십원짜리 "
					+ ship+ "개입니다.");
		}
	}
	
			
		

		
		
		
	


