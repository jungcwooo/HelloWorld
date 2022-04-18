package co.edu.friend;

// 친구의 주소록 : 이름, 연락처
// 학교친구 : 학교이름, 전공과목
// 회사친구 : 회사이름, 부서이름
public class Friend {
	private String name;
	private String phoneNo;

	protected Friend() {

	}

	public Friend(String name, String phoneNo) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
	}

	protected String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Friend [name = " + name + ", phoneNo = " + phoneNo + "]";
	}

}
