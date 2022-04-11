package co.edu.variable;

public class VarExample2 {
	public static void main(String[] args) {
		double korScore = 82.4;
		double engScore = 71.7;
		double matScore = 95.2;
		double sum;
		double avg;
		
		sum = (korScore+engScore+matScore) ;
		avg = (korScore+engScore+matScore)/3 ;
		
		System.out.println("영어점수는 "+engScore+"점과 수학점수 "+matScore+"점과 국어점수 "+korScore+"점의 합은 "+sum+"점 입니다.");
		System.out.println("점수의 평균은 "+avg+"점입니다");

	}

}
