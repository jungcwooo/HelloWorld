package co.edu;

public class Student {
	// 필드
	String name;
	String studNo;
	int age;
	double height;

	// 생성자 > 인스턴스를 만들어줄때처리할 기능정의
	// 매개값이 없는 생성자를 기본 생성자라고한다.
	public Student() {
		
	}


	// 생성자는 필드의 값을 지정할 때.
	public Student(String name, String studNo, int age, double height) {
		super();
		this.name = name;
		this.studNo = studNo;
		this.age = age;
		this.height = height;
	}

	

	// 메서드
	void study() {
		System.out.println(name + "이(가) 공부를 합니다");
	}

	void eat() {
		System.out.println(name + "이(가) 밥을 먹습니다.");
	}

	void showInfo() {
		System.out.println("이름은 " + name + "이고, 학생번호는 " + studNo + "번, 나이는 " + age + "살이고, 키는 " + height + "cm입니다.");
	}
}
