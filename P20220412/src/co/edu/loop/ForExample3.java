package co.edu.loop;

import java.util.Scanner;

public class ForExample3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int sum = 0;
		int sum1 = 1;
		int sum2 = scn.nextInt();
		int num = 0;
		for (int i = 1; i <= sum2; i++) {
			sum += i;
			if(sum>sum2) { 
				num = i;
				System.out.println(num+"번째 숫자");
				System.out.println(sum2+"보다 큰 최소합계 : "+sum);
				break;}
			}
		for (int i = 1; i <= 10; i++) {
			sum1 *= i;
		}
		System.out.println(sum1);
		
		for (int i = 1; i <= sum2; i++) {
			if (sum2 % i == 0) {
				System.out.println(sum2+"의 약수는 : "+i);
			} else {
				continue;
			}
		}
		
	}
}
 