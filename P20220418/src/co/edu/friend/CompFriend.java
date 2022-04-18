package co.edu.friend;

public class CompFriend extends Friend {
	private String compName;
	private String department;

	public CompFriend(String name, String phoneNo, String compName, String department) {
		super(name, phoneNo);
		this.compName = compName;
		this.department = department;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public String getDivision() {
		return department;
	}

	public void setDivision(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "CompFriend [name = " + super.getName() + ", phoneNo = " + this.getPhoneNo() + ", compName = " + compName
				+ ", department = " + department + "]";
	}

}
