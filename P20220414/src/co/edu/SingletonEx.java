package co.edu;

import co.edu.statics.Singleton;

public class SingletonEx {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton.seynin(0);
		s1.getnin();
	}
}
