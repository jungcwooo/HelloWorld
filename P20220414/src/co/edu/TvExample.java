package co.edu;

public class TvExample {
	public static void main(String[] args) {
		Television tv = new Television();

		tv.company = "삼성";
		tv.color = "퍼플";
		tv.price = 300000;
		tv.model = "40Inch";

		tv.turnOff(); 
		tv.changeChanel(24);

		Television tv1 = new Television();

//		System.out.println(tv);
//		System.out.println(tv1); 

		Student s1 = new Student();
		s1.name = "정철우";
		s1.age = 29;
		s1.height = 181.1;
		s1.studNo = "22-15934";

		Student s2 = new Student();
		s2.name = "김철우";
		s2.age = 25;
		s2.height = 174.1;
		s2.studNo = "22-55475";

		Student s3 = new Student("박철우", "22-55555", 25, 175.4);

		s1.study();
		s1.showInfo();
		s2.showInfo();
		s3.showInfo();
	}

}
