package co.edu.abstracts;

public abstract class Car {

	private String model;
	public abstract void turnOn(); // 차의 시동을 켜는 기능
	public abstract void start(); // 출발 기능
	public abstract void run(); // 운전 기능
	public abstract void stop(); // 멈춤 기능
	public abstract void turnOff(); // 시동을 끄는 기능
}
