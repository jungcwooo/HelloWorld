package co.edu.abstracts;

public class Main {

	public static void main(String[] args) {
		Animal animal = null;
		animal = new Bird();
		animal.eat();
		animal.run();
		
		Animal animal1 = null;
		animal1 = new Fish();
		animal1.eat();
		animal1.run();
	}

}
