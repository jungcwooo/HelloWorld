package co.edu.variable;

public class VarExample6 {
	public static void main(String[] args) {
		String myName = "정철우"; // 참조 데이터 타입
		
		int age = 29; // 기본 데이터 타입
		double height = 180.7;
		int matScore, engScore;
		matScore = 90;
		engScore = 100;
		
		char firstChar = myName.charAt(0);
		System.out.println(myName.charAt(0));
		
		if(firstChar == '정') {
			System.out.println("같다");
			
		System.out.println(myName + "의 나이는 "+ age+ "이고 키는 "+height+"이고 영어, 수학점의 합은"+(matScore+engScore)+"입니다.");
		}
		
		
	} // 다른지 확인

}
