package co.edu.variable;

public class VarExample3 {
	public static void main(String[] args) {
		{	int[] x = {0};
			int age = 29;
		
			System.out.println("나이는 "+age);
			System.out.println(x[0]);
		}
		int age =29;
		System.out.println("나이는 "+age);
		
		boolean isTure = true;
		isTure = age >25;
		
		if(isTure) {
			System.out.println("늙음");
		} else {System.out.println("젊음");	}
	
}
}
