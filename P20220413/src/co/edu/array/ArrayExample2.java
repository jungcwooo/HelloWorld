package co.edu.array;

import java.util.Arrays;

public class ArrayExample2 {
	public static void main(String[] args) {
		
		int max = 0;
		int[] intAry = {10, 20, 30, 40, 50};
		int sum = 0;
		
	
		
		for(int i = 0; i < intAry.length ; i++ ) {
			System.out.println(intAry[i]);
			
			if(max < intAry[i]) {
				max= intAry[i];
			}
			
			sum += intAry[i];
		}
		System.out.println("최대값 : " + max);
		System.out.println("총  합 : " + sum);

		
	}

}
