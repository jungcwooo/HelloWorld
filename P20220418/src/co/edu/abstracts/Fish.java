package co.edu.abstracts;

public class Fish extends Animal {
	@Override
	public void eat() {
		System.out.println("물고기가 먹이를 먹습니다");
	}

	@Override
	public void run() {
		System.out.println("물고기가 해엄을 칩니다");
	}
}
