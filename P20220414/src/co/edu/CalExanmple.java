package co.edu;

public class CalExanmple {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.printPI();
		c1.getArea(5.2);
		
		int sum = c1.sum(8, 15);
		System.out.println(c1.sum(8, 80));
		System.out.println(c1.sum(8, 80.4));
		System.out.println("두 수의 합은 "+sum+"입니다.");
	
		double Triangle = c1.getTriangleArea(5.5, 4.9);
		System.out.println("삼각형의넓이는 "+Triangle+"입니다.");
		
		int[] intAry = {10,20,60,50,31};
		int result = c1.sum(intAry);
		System.out.println(result);
		
		double result2 = c1.avg(intAry);
		System.out.println(result2);
		
	}
}
