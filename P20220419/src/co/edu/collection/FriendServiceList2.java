package co.edu.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//추가, 수정, 삭제, 조회
public class FriendServiceList2 implements FriendService {
	ArrayList friends = new ArrayList();

	Scanner scn = new Scanner(System.in);

	@Override
	// 추가
	public void addFriend(Friend friend) {

		System.out.println("추가할 친구의 이름을 입력해주세요");
		String addName = scn.nextLine();
		System.out.println("추가할 친구의 연락처을 입력해주세요");
		String phoneNo = scn.nextLine();
		friends.add(new Friend(addName, phoneNo));

		System.out.println("완료 되었습니다.");

	}

	@Override
	// 수정
	public void modFriend(Friend friend) {
		System.out.println("수정할 친구의 이름을 입력해주세요");
		String setName = scn.nextLine();

		for (int i = 0; i < friends.size(); i++) {
			Friend fi = (Friend) friends.get(i);
			if (fi.getName().equals(setName)) {
				System.out.println("수정할 연락처를 입력해주세요");
				String setNo = scn.nextLine();
				fi.setPhoneNo(setNo);

				System.out.println("완료 되었습니다.");

			}

		}
	}

	@Override
	// 삭제
	public void remFriend(String name) {
		System.out.println("삭제할 친구의 이름을 입력해주세요");
		String RemName = scn.nextLine();

		for (int i = 0; i < friends.size(); i++) {
			Friend fi = (Friend) friends.get(i);
			if (fi.getName().equals(RemName)) {
				friends.remove(i);
				System.out.println("완료 되었습니다.");

			}

		}

	}

	@Override
	// 조회
	public Friend findFriend(String name) {
		for (int i = 0; i < friends.size(); i++) {
			Friend f2 = (Friend) friends.get(i);
			System.out.println(f2);

		}

		return null;

	}

	public Friend findFriend2(String name) {
		Friend f2;
		System.out.println("조회할 친구의 이름을 입력해주세요");
		String searchName = scn.nextLine();
		for (int i = 0; i < friends.size(); i++) {
			f2 = (Friend) friends.get(i);
			if (f2.getName().equals(searchName)) {
				System.out.println(f2);

			}

		}

		return null;

	}
}
