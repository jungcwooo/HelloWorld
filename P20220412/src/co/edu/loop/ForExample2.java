package co.edu.loop;

public class ForExample2 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <+ 100; i++) {
			
			if(i==31) { break; }

			if(i % 2 ==0) {
				System.out.println("현재 i의 값은 => " + i);
				continue;
			}
			sum += i;
			System.out.print(i+"번째 : ");
			System.out.println(sum);
		}
	}

}
