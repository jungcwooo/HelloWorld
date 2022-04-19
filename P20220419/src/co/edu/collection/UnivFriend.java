package co.edu.collection;

public class UnivFriend extends Friend {
	private String univName;
	private String major;
	

	public UnivFriend(String name, String phoneNo, String univName, String major) {
		super(name, phoneNo);
		this.univName = univName;
		this.major = major;
	}


	public String getUnivName() {
		return univName;
	}


	public void setUnivName(String univName) {
		this.univName = univName;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}


	@Override
	public String toString() {
		return "UnivFriend [name = " + getName() + ", phoneNo = " + getPhoneNo()+", univName = " + univName + ", major = " + major + "]";
	}
	
}
