package co.edu.array;

public class ArrayExample3 {
	public static void main(String[] args) {
		
		int[] intAry = {78, 83, 88, 92, 63};
		
		int sum = 0;
		double avg = 0.0;
		
		for (int i = 0; i < intAry.length; i++) {
			sum += intAry[i];
			System.out.println(intAry[i]);
		}

		avg = (double)(sum/5.0);
		
		System.out.println("합계 : "+ sum);
		System.out.println("평균 : "+ avg);
		
		System.out.println("######################");
		
		int sum1 = 0;
		double avg1 = 0.0;
		double co1 = 0.0;
		
		for (int i = 0; i < intAry.length; i++) {
			if(i % 2 == 0) {
				sum1 += intAry[i];
				System.out.println(intAry[i]);
				co1++;
			}	
		}
		avg1 = (double)(sum1/co1);
		
		
		System.out.println("합계 : "+ sum1);
		System.out.println("평균 : "+ avg1);
		
		System.out.println("#######################");
		
		int sum2 = 0;
		double avg2 = 0.0;
		double co2 = 0.0;
		
		for (int i = 0; i < intAry.length; i++) {
			if(intAry[i] % 2 == 0) {
				sum2 += intAry[i];
				System.out.println(intAry[i]);
				co2++;
			} else continue;
			
		}
		avg2 = (double)(sum2/co2);
		
		System.out.println("합계 : "+ sum2);
		System.out.println("평균 : "+ avg2);
		
		
	}

}
