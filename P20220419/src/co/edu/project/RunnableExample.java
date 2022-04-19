package co.edu.project;

// 구현 클래스명
interface Runnable {
	public void run();
}

class RunClass implements Runnable {

	@Override
	public void run() {
		System.out.println("달립니다.");
	}

}

public class RunnableExample {
	public static void main(String[] args) {
		Runnable runnable;

		

		runnable = new Runnable() { // 익명구현객체.
			@Override
			public void run() {
				System.out.println("개가 움직입니다.");
			} // 익명구현객체.
		};

		runnable.run();
		
		// 익명구현객체.  함수적 인터페이스
		runnable = () -> System.out.println("고양이가 움직입니다.");
		
		
		runnable.run();
	}
}
