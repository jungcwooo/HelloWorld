package co.Jung.card;

public class Person {
	private String name;
	private String ssn;
	private String address;

	public Person() {
	}

	public Person(String name, String ssn, String address) {
		this.name = name;
		this.ssn = ssn;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
