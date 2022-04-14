package co.edu;

public class Calculator {
	private double pi = 3.14;

	// 리턴타입 없는 것
	void printPI() {
		System.out.println("원주율은 " + pi + "입니다.");
	}

	void getArea(double radius) {
		double area = radius * radius * pi;
		System.out.printf("반지름 %.2f의 넓이는 %.2f이다.%n", radius, area);
	}

	double getTriangleArea(double h, double l) {
		return (h * l) / 2.0;
	}

	// 리턴타입 있는 것
	int sum(int num1, int num2) {
		return num1 + num2;
	}

	double sum(double n1, double n2) { // 동일한 이름의 메서드를 정의하는 것 (오버로딩)
		return n1 + n2;
	}

	int sum(int[] ary) {
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];
		}
		return sum;
	}

//	double avg(int[] ary) {
//		int sum = 0;
//		double avg = 0;
//		for (int i = 0; i < ary.length; i++) {
//			sum += ary[i];
//		}
//		avg = (double) sum / ary.length;
//		return avg;
//	}

	double avg(int n1, int n2, int n3) {
		return (n1 + n2 + n3) / 3.0;
	}
	
	double avg(int... args) {
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < args.length; i++) {
			sum += args[i];
		} return (double) sum / args.length;
	}
}
