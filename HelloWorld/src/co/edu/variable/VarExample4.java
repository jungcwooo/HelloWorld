package co.edu.variable;

public class VarExample4 {
	public static void main(String[] args) {
		int eng = 80;
		int mat = 70;
		boolean isTure = eng > mat;
		int c = (mat - eng);
		int d = (eng - mat);
		
		if(isTure) {
			System.out.println("영어 점수가 수학점수보다 "+d +"점 큽니다.");
		} else 
			System.out.println("수학 점수가 영어점수보다 "+c +"점 큽니다.");
	}

}
