package co.edu.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//추가, 수정, 삭제, 조회
public class FriendServiceList implements FriendService {
	ArrayList<Friend> friends = new ArrayList<Friend>();
	ArrayList<Friend> menFri = new ArrayList<Friend>();
	ArrayList<Friend> womFri = new ArrayList<Friend>();
	Scanner scn = new Scanner(System.in);

	@Override
	// 추가
	public void addFriend() {

		System.out.println("추가할 친구의 이름을 입력해주세요");
		String addName = scn.nextLine();
		System.out.println("추가할 친구의 연락처를 입력해주세요");
		String phoneNo = scn.nextLine();
		System.out.println("추가할 친구의 성별을 입력해주세요");
		System.out.println("Ex) 남자 , 여자 ");
		String gender = scn.nextLine();
		Gender gen = Gender.MEN;

		if (gender.startsWith("남")) {
			gen = Gender.MEN;

		} else if (gender.startsWith("여")) {
			gen = Gender.WOMEN;

		} else {
			System.out.println("잘못 입력하셨습니다.");

		}
		friends.add(new Friend(addName, phoneNo, gen));

		System.out.println("완료 되었습니다.");

	}

	@Override
	// 수정
	public void modFriend() {
		System.out.println("수정할 친구의 이름을 입력해주세요");
		String setName = scn.nextLine();

		for (int i = 0; i < friends.size(); i++) {
//			Friend fi = (Friend) friends.get(i);
			if (friends.get(i).getName().equals(setName)) {
				System.out.println("변경할 " + setName + "님의 연락처를 입력해주세요");
				String setNo = scn.nextLine();
				friends.get(i).setPhoneNo(setNo);

				System.out.println("완료 되었습니다.");

			}

		}
	}

	@Override
	// 삭제
	public void remFriend() {
		System.out.println("삭제할 친구의 이름을 입력해주세요");
		String RemName = scn.nextLine();

		for (int i = 0; i < friends.size(); i++) {
//			Friend fi = friends.get(i);
			if (friends.get(i).getName().equals(RemName)) {
				friends.remove(i);
				System.out.println("완료 되었습니다.");

			}

		}

	}

	@Override
	// 조회
	public void findFriend() {
		for (int i = 0; i < friends.size(); i++) {
//			Friend f2 = friends.get(i);
			System.out.println(friends.get(i));

		}

	}

	@Override
	public void findGender() {
		ArrayList<Friend> list = new ArrayList<Friend>();
		System.out.println("조회할 성별을 입력해주세요");
		System.out.println("남자 : 남, 남자, M , 여자 : 여, 여자, W");
		String gender1 = scn.nextLine();
		if (gender1.startsWith("남")||gender1.startsWith("M")) {
			gender1 = "MEN";
		} else if (gender1.startsWith("여") || gender1.startsWith("W")) {
			gender1 = "WOMEN";
		}
//		if(gender1.startsWith("남")){
//			for (int i = 0; i < menFri.size(); i++) {
//				System.out.println(menFri.get(i));
//			}
//		} else if(gender1.startsWith("여")) {
//			for (int i = 0; i < womFri.size(); i++) {
//				System.out.println(womFri.get(i));
//			}
//		}

		for (int i = 0; i < friends.size(); i++) {
			if (friends.get(i).getGender().name().startsWith(gender1)) {

				System.out.println(friends.get(i));

			} else if (friends.get(i).getGender().name().startsWith(gender1)) {

				System.out.println(friends.get(i));

			}

		}
		for (int i = 0; i < list.size(); i++) {
			list.get(i);

		}
	}

	public void findFriend2() {
//		Friend f2;
		System.out.println("조회할 친구의 이름을 입력해주세요");
		String searchName = scn.nextLine();
		for (int i = 0; i < friends.size(); i++) {
//			f2 = friends.get(i);
			if (friends.get(i).getName().equals(searchName)) {
				System.out.println(friends.get(i));

			}

		}

	}
}
