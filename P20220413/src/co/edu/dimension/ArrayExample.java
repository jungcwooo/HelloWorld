package co.edu.dimension;


public class ArrayExample {
	public static void main(String[] args) {
		int[][] arr = new int [5][5];
		int a = 1;
		
		for (int i = 0; i < arr.length ; i++){
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = a++;
			}
		}
		
		
		for (int i = arr.length-1; i >= 0; i--){
			for (int j = 0; j < arr[i].length; j++) {
			
				System.out.printf("[%2d]",arr[i][j]);
			}
			System.out.println();
			
		}
		System.out.println("##################");

		
		
	}

}
