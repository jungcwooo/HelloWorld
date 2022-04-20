package co.edu.collection;


// 친구의 주소록 : 이름, 연락처
// 학교친구 : 학교이름, 전공과목
// 회사친구 : 회사이름, 부서이름
public class Friend {
	private String name;
	private String phoneNo;
	private Gender gender;
	// 남자 남 M 여자 여 W 성별을 뜻하는 단어가 많아 혼동이 생길 수 있다.
	

	public Friend() {

	}

	public Friend(String name, String phoneNo, Gender gender) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.gender = gender;
	}

	public Friend(String name, String phoneNo) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
	}

	public String getName() {
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
	
	

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Friend [name = " + name + ", phoneNo = " + phoneNo +", gender = "+ gender +"]";
	}

}
