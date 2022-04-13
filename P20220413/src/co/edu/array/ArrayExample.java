package co.edu.array;

import java.util.Arrays;

public class ArrayExample {
	public static void main(String[] args) {

		int[] intArr = new int[5];
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = i + 1;
		}
		double[] douArr = new double[10];

		System.out.println(Arrays.toString(intArr));
		// 배열의 나열을 출력하고 싶을땐 Arrays클래스의 toString을 사용한다.

		String[] strAry = new String[5]; // String의 기본값은 null이다.
		System.out.println(Arrays.toString(strAry));

		int[] otherAry = { 10, 20, 30, 40 }; // 생성과 선언을 동시에
		int[] theOtherAry = { 10, 20, 30, 40 };

		System.out.println(Arrays.toString(otherAry));

		if (otherAry == theOtherAry) {
			System.out.println("같다!");
		} else {
			System.out.println("다른데?");
		}

		if (otherAry[0] == theOtherAry[0]) {
			System.out.println("같다!");
		} else {
			System.out.println("다른데?");
		}
	}

}
