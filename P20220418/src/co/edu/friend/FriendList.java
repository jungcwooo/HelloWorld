package co.edu.friend;

import java.util.Scanner;

public class FriendList {
	public static void main(String[] args) {
		Friend[] friends = new Friend[10];
//		friends[0] = new UnivFriend("홍길동","0103333666","대구보건대","치기공");
//		friends[1] = new CompFriend("김길동","01033444426","네이버","개발팀");
//		friends[2] = new Friend("박길동","01034848746");
//		
		while (true) {
			System.out.println("=======================================================");
			System.out.println("|| 1. 친구등록 | 2. 리스트 | 3. 조회(이름) | 4. 종료 ||");
			System.out.println("=======================================================");
			System.out.print("선택 => ");

			int menu = 0;

			Scanner scn = new Scanner(System.in);
			menu = Integer.parseInt(scn.nextLine());

			System.out.println();
			if (menu == 1) {
				Friend fre = null;

				System.out.println("그 친구의 소속은? 1. 동네 2. 학교 3. 회사 ");
				int searchNo = Integer.parseInt(scn.nextLine());

				if (!(searchNo > 3 || searchNo < 0)) {

					System.out.println("친구의 이름을 입력해주세요.");
					String fName = scn.nextLine();
					System.out.println("친구의 연락처를 입력해주세요.");
					String fPhNo = scn.nextLine();

					if (searchNo == 1) {
						fre = new Friend(fName, fPhNo);
						System.out.println("등록이 완료되었습니다.");
						

					} else if (searchNo == 2) {
						System.out.println("친구를 만난 학교 이름을 입력하세요");
						String fUnName = scn.nextLine();
						System.out.println("친구의 전공과목 이름을 입력하세요");
						String fMajor = scn.nextLine();
						fre = new UnivFriend(fName, fPhNo, fUnName, fMajor);
						System.out.println("등록이 완료되었습니다.");
						

					} else if (searchNo == 3) {
						System.out.println("친구를 만난 회사 이름을 입력하세요");
						String fCoName = scn.nextLine();
						System.out.println("친구의 부서 이름을 입력하세요");
						String fDepa = scn.nextLine();
						fre = new CompFriend(fName, fPhNo, fCoName, fDepa);
						System.out.println("등록이 완료되었습니다.");
						

					}

					for (int i = 0; i < friends.length; i++) {
						if (friends[i] == null) {
							friends[i] = fre;
							break;
						}
					}

				} else {
					System.out.println("잘못 입력 하셨습니다.");
					System.out.println();

				}

			} else if (menu == 2) {
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null) {
						System.out.println("친구정보 : " + friends[i].toString());
					}
				}
			} else if (menu == 3) {
				System.out.println("조회할 이름을 입력해주세요");
				String fName = scn.nextLine();
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null && friends[i].getName().equals(fName)) {
						System.out.println("친구정보 : " + friends[i].toString());
					}
				}
			} else if (menu == 4) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다");
				continue;
			}

		}

	}
}
