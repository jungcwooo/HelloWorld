package co.edu.array;

public class ArrayExample4 {
	public static void main(String[] args) {
		
		int[] ran = new int[5];
		int cnt = 0;
		int sum = 0;
		double avg = 0;
		
		for (int i = 0; i < ran.length; i++) {
			ran[i] = (int)(30*(Math.random())+1);
			System.out.println(ran[i]);

		}
		
		for (int i = 0; i < ran.length; i++) {
			if (ran[i] > 15) {
				System.out.println("15 보다 큰 값 : "+ran[i]);
				sum += ran[i];
				cnt++;
			}
		}
		
		avg = (double)sum/cnt;
		
		System.out.println("15가 넘는 값들의 갯수 : "+ cnt);
		System.out.println("15가 넘는 값들의 합계 : "+ sum);
		System.out.println("15가 넘는 값들의 평균 : "+ avg);
	}

}
