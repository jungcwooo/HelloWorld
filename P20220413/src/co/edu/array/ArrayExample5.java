package co.edu.array;

import java.util.Scanner;

public class ArrayExample5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int[] scores = new int[5];
		
		
		for(int i =0; i <scores.length; i++) {
			System.out.println(i+1+"번째 학생의 점수를 입력하세요");
			scores[i] = scn.nextInt();
		}
		
		int cnt = 0;
		int sum = 0;
		int max = 0;
		int min = scores[0];
		double avg = 0.0;
		
		for (int i = 0; i < scores.length; i++) {
			if(scores[i]>max) {
				max = scores[i];
			}
			if(scores[i]<min) {
				min = scores[i];
			}
			cnt++;
			sum += scores[i];
			System.out.println(i+1+"번 학생의 점수 = " +scores[i]);
		}
		
		avg = (double)sum/cnt;
		
		
		System.out.println();
		System.out.println("최고점 : "+max);
		System.out.println("최저점 : "+min);		
		System.out.println("합  계 : "+sum);
		System.out.println("평  균 : "+avg);
	}
}
