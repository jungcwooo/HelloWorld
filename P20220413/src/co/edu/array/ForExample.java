package co.edu.array;

public class ForExample {
	public static void main(String[] args) {
		
	
			
		
		for (int i = 1; i <=6 ; i++) {
			for (int j = 1; j <= 6; j++) {
				if((i+j)==6) {
					System.out.print("첫번째 주사위 : "+ i);
					System.out.println(", 두번째 주사위 : "+ j);
				}
				
			}
		}
}
}

