package co.edu.condition;

public class IfExample {

	public static void main(String[] args) {
		int score = 60;

		if (score >= 90) {
			System.out.println("A");
		} else if (score < 90 && score >= 80) {
			System.out.println("B");
		} else if (score < 80 && score >= 70) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}
	}

}
