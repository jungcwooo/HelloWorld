package co.edu;

public class InheritExample {
	public static void main(String[] args) {

		Child1 ch1 = new Child1();

		ch1.field1 = "";
		ch1.field2 = "";

		ch1.method1();
		ch1.method2();

		Child2 ch2 = new Child2();

		ch2.field1 = "";
		ch2.filed3 = "";

		ch2.method1();
		ch2.method3();

		Parent p1 = new Parent();
		p1 = new Child1();
		p1 = new Child2();

		p1.field1 = ""; // 부모가 가지고 있는 필드와 메소드만 사용가능
		p1.method1();

		ch1 = (Child1) p1; // 강제형변환
		ch1.field1 = "";
		ch1.field2 = "";
		ch1.method1();
		ch1.method2();
		

	}
}
