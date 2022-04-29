package co.edu.api;

import java.util.HashSet;
import java.util.Objects;

class Member {

	String name;
	int age;

	Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
//		return Objects.hash(age, name);
		return this.age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(member.name);
		}
//		return super.equals(obj);
		return false;
	}

	@Override
	public String toString() {
		return "이름은 "+name +", 나이는 "+age;
	}
	
}

public class ObjectExample {
	public static void main(String[] args) {

		// ArratList : 인덱스요소를 구분 => 중복된 저장
		// Set(집합) : 요소값으로 구분 => 중복된 값 X

		HashSet<Integer> set = new HashSet<Integer>();
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(200);

		System.out.println(set.size());

		HashSet<Member> members = new HashSet<Member>();

		members.add(new Member("정철우", 29));
		members.add(new Member("박철우", 25));
		members.add(new Member("김철우", 22));
		members.add(new Member("정철우", 29));

		System.out.println(members.size());

		System.out.println("정철우".hashCode());
		System.out.println(new Member("정철우", 29).toString());
	}
}
