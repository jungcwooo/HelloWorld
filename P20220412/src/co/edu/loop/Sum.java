package co.edu.loop;

public class Sum {

	public static void main(String[] args) {
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		int[] im = new int[20];
		for (int i = 0; i < im.length; i++) {
			sum += i;
			im[i] = sum;
		}
		for (int x = 0; x < im.length; x++) {
			System.out.print(x + "번 : ");
			System.out.println(im[x]);
		}
		System.out.println("--------------");
		for (int i = 1; i < 10; i += 2) {
			sum1 = sum1 + i;
			System.out.println(sum1);
		}

		System.out.println("--------------");
		for (int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
			sum2 += i;
			System.out.println(sum2);
			}
		}
	}
}
