package co.edu.variable;

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		int money;
		int product = 7500;
		int tax;
		int change;
		int one;
		
		System.out.println("돈을 투입해주세요");
		Scanner scn = new Scanner(System.in);
		money = scn.nextInt();
		
		System.out.println(money+"원을 투입하셨습니다.");
		
		tax = product/10;
		one = product - tax;
		
		change = money - product;
		
		System.out.println("선택하신 제품의 가격은 상품가격 " + one+"원과 부가세 "+tax+"원을 합한 가격입니다.");
		System.out.println("지불하실 금액은 " + product+"원으로 거스름돈 "+change+"원입니다.");
		
		//완료
		
		
	}

}
