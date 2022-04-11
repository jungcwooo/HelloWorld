package co.edu;


public class MyInfo {
	public static void main(String[] args) {
		String x = "정철우";
		String[] y = {"010","3753","6703"};
		String z = String.join("-",y);
		
		 System.out.println("이름은 "+x.toString()+"이고"+" 연락처는 01037536703입니다");
		 System.out.println("이름은 "+x.toString()+"이고"+" 연락처는 "+z+"입니다");

	}

}
