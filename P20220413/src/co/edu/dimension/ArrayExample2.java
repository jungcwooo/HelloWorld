package co.edu.dimension;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] num = new int[5];
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(i+1+"번째 값 입력 >>");
			num[i] = scn.nextInt();
		}
		
		for (int i = 0; i < num.length-1; i++) {
			for (int j = 0; j < num.length-1; j++) {
				if(num[j] > num[j + 1]) {
					int tmp = num[j];
					num[j] = num[j+1 ];
					num[j+1] = tmp;
				}
			}
		}
		
		
//		Arrays.sort(num);
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
			
		
	}

}
