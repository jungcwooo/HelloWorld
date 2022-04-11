package co.edu.variable;

public class VarExample {
	public static void main (String[] args) {
//		변수의 선언
		int age = 29; // 오른쪽의 값을 왼쪽 변수에 할당.
		double height = 180.7;
		String myName = "정철우";
		
		age++;
		
		System.out.println("이름은 "+myName);
		System.out.println("나이는 "+age+ "살입니다.");
		System.out.println("키는 "+ height+ "cm입니다.");
			
		//영어 점수 :85; engScore에 할당
		int engScore = 85;
		int matScore = 90;
		
		engScore = 80;
		matScore = 50;
		
		int result = engScore + matScore;
		
		engScore = 100;
		matScore = 70;
		result = engScore + matScore;
		
		System.out.println("영어점수는 "+engScore+"점과 수학점수 "+matScore+"점의 합은 "+result+"점 입니다.");
	}
}
