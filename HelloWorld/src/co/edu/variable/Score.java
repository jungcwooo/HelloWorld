package co.edu.variable;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Score {
	public static void main(String[] args) {
		
		int num1,num2,num3;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요");
		num1 = scn.nextInt();
		System.out.println("두번째 정수를 입력하세요");
		num2 = scn.nextInt();
		System.out.println("세번째 정수를 입력하세요");
		num3 = scn.nextInt();
		
		int sum = (num1+num2+num3);
		double avg = sum/3.0;
		int max = num1;
		if(max < num2) {max = num2;}
		if(max < num3) {max = num3;}
		
		System.out.printf("세 정수의 합은 %d이고 평균은 %.2f이고 최고점은 %d점입니다.", sum,avg,max);
	}
}
