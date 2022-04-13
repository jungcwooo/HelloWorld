package co.edu.dimension;

public class ArrayExample3 {
	public static void main(String[] args) {
		int[][] scores = {{59, 63, 72},{44,22,65,54},{23,53}};
		
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.printf("%3d",scores[i][j]);
			}
			System.out.println();
		}
		
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
		System.out.println(scores[2].length);

		
		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			double avg = 0;
			
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
				avg = (double)sum/scores[i].length;
			}
			System.out.println(i+1+"반의 총합 : "+sum);
			System.out.println(i+1+"반의 평균 : "+avg);
			System.out.println();

			
		}

	}

}
