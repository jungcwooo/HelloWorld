package co.edu.poly;

public class HankookTire extends Tire {

	public HankookTire(String loaction, int maxRotation) {
		super(loaction, maxRotation);
	}
	@Override
	public boolean roll() {
		accumulateRotation++;
		if(accumulateRotation<maxRotation) {
			System.out.println(location + " 한국 Tire 수명은 "+ (maxRotation-accumulateRotation) + "회 남았습니다");
			return true;
		} else {
			System.out.println("**** " +location + " 한국 Tire 펑크 ****");

			return false;
		}
	}
}
