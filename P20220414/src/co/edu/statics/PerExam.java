package co.edu.statics;

public class PerExam {
	public static void main(String[] args) {
		Person p1 = new Person("232323", "정철우");
		p1.name = "철우";
//		p1.ssn = "22222"; // 상수이기 때문에 변경불가
		
		System.out.println(p1.name);
		
		Person p2 = new Person("232321231233", "박철우");
		System.out.println(Person.PI);
		System.out.println(p2.PI);

	}
}
