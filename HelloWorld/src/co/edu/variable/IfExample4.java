package co.edu.variable;

import java.util.Scanner;

public class IfExample4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		
		System.out.println("첫번째 숫자를 입력하세요");
		num1 = scn.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		num2 = scn.nextInt();
		System.out.println("세번째 숫자를 입력하세요");
		num3 = scn.nextInt();
		
		int sum = num1+num2+num3;
		
		double avg = ((num1+num2+num3)/3.0); // num1,num2,num3의 평균 값을 저장하기 위한 변수
		

		System.out.printf("입력하신 정수는 %d, %d, %d입니다.\n",num1,num2,num3);
		System.out.println("세 정수의 합은 "+sum+"이고 평균은 "+avg+"입니다.");
		System.out.printf("세 정수의 합은 %d이고 평균은 %.2f입니다.",sum,avg);

	}

}
