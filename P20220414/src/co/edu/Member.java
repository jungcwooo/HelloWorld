package co.edu;

public class Member {
	// 회원정보를 담아두고싶다.
	private String id;
	private String name;
	private String num;
	private int age;

	public Member() {
	}

	public Member(String id, String name, String num, int age) {
		this.id = id;
		this.name = name;
		this.num = num;
		this.age = age;
	}

	public void setAge(int age) {
		if (age < 0) {
			this.age = 20;
		} else {
			this.age = age;
		}
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public void setId(String id) {

		this.id = id;

	}

	public String getId() {
		return id;
	}

	public void showInfo() {
		System.out.printf("%5s | %4d | %5s |  %13s %n", name, age, id, num);
	}
}
