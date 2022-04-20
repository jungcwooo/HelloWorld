package co.edu.nested;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

class Friend {
	String name;
	String phoneNo;
	int age;

	public Friend() {

	}

	public Friend(String name, String phoneNo, int age) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + ", phoneNo=" + phoneNo + ", age=" + age + "]";
	}

}

public class NestedApp {
	static Scanner scn = new Scanner(System.in);
	static Friend[] friends = new Friend[10];

	interface FriendService {
		int ADD = 1;
		int MOD = 2;
		int LIST = 3;

		void add();

		void modify();

		void list();
	}

	static class FriendApp implements FriendService {
		static Scanner scn = new Scanner(System.in);

		@Override
		public void add() {

			System.out.println("친구를 추가합니다.");
			System.out.print("이름 => ");
			String addName = scn.next();
			System.out.print("연락처 => ");
			String phoneNo = scn.next();
			System.out.print("나이 => ");
			int addAge = Integer.parseInt(scn.next());

//			Friend friend = new Friend();
//			friend.setName(addName);
//			friend.setPhoneNo(phoneNo);
//			friend.setAge(addAge);
			for (int j = 0; j < friends.length; j++) {
				if (friends[j] == null) {
					Friend friend = new Friend();
					friend.setName(addName);
					friend.setPhoneNo(phoneNo);
					friend.setAge(addAge);

					friends[j] = friend;
					break;
				}
			}

		}

		@Override
		public void modify() {

			System.out.println("친구의 정보를 수정합니다.");
			System.out.print("수정할 대상 => ");
			String inseltName = scn.next();

			for (int j = 0; j < friends.length; j++) {
				if (friends[j] != null && friends[j].getName().equals(inseltName)) {
					System.out.print(inseltName + "님의 수정할 연락처 => ");
					String inseltNo = scn.next();
					friends[j].setPhoneNo(inseltNo);
					System.out.print(inseltName + "님의 수정할 나이 => ");
					String inseltAge = scn.next();
					friends[j].setPhoneNo(inseltAge);
				} else {
					System.out.println("대상이 없습니다.");
					break;
				}
			}

		}

		@Override
		public void list() {
			System.out.print("조회할 대상 => ");
			String searchtName = scn.next();
			int count = 0;
			for (int j = 0; j < friends.length; j++) {
				if (friends[j] != null && friends[j].getName().equals(searchtName)) {
					System.out.println(searchtName + "님의 정보");

					System.out.println(friends[j]);
					count++;
				}
			}
			if (count == 0) {
				System.out.println("대상을 찾을 수 없습니다.");

			}

		}

	}

	public static void main(String[] args) {
		FriendApp app = new FriendApp();

		while (true) {

			int menu = 0;

			System.out.println("1. 추가 2. 수정 3. 조회 4. 종료");
			menu = Integer.parseInt(scn.next());
			System.out.println();

			if (menu == FriendApp.ADD) {
				app.add();
			} else if (menu == FriendApp.MOD) {
				app.modify();
			} else if (menu == FriendApp.LIST) {
				app.list();
			} else {
				break;
			}

		}
	}
}
