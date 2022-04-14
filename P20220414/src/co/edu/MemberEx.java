package co.edu;

import java.util.Scanner;

public class MemberEx {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		Member[] members = new Member[1];
		for (int i = 0; i < members.length; i++) {
			System.out.println("ID, 이름, 연락처, 나이 순으로  입력해주세요=> ");
			String id = scn.next();
			String name = scn.next();
			String num = scn.next();
			int age = Integer.parseInt(scn.next());
			members[i] = new Member(id, name, num, age);

		}

		boolean isTrue = true;
		// 1. 조회 2. 변경(아이디, 연락처) 3. 조회(입력한 나이보다 큰 회원만) 4.종료
		while (isTrue) {
			String[] dd = {"이름","나이","ID","연락처"};
			System.out.println("1. 조회 2. 변경(아이디, 연락처) 3. 조회(입력한 나이보다 큰 회원만) 4.종료");
			System.out.print("선택 => ");

			int c = scn.nextInt();
//			scn.nextInt();
			if (c == 1) {
				System.out.println("회원들의 정보를 조회합니다.");
				System.out.println();
				System.out.printf("%5s | %4s | %5s |  %8s %n", dd[0],dd[1],dd[2],dd[3]);

				for (int i = 0; i < members.length; i++) {
					members[i].showInfo();
					System.out.println("---------------------------------------------------------------------");
					System.out.println();
				}
			} else if (c == 2) {
				System.out.println("연락처를 변경할 ID을 입력해주세요.");
				String na = scn.nextLine();
				na = scn.nextLine();
				for (int i = 0; i < members.length; i++) {
					if (members[i].getId().equals(na)) {
						System.out.println(members[i].getId() + "님의 변경할 연락처를 입력해주세요");
						String sid = scn.nextLine();
						members[i].setNum(sid);
						System.out.println("변경되었습니다.");
					} else
						continue;
				}
			} else if (c == 3) {
				System.out.println("입력한 나이보다 많은 회원을 조회합니다.");
				int snu = scn.nextInt();
				System.out.printf("%5s | %4s | %5s |  %8s %n", dd[0],dd[1],dd[2],dd[3]);
				for (int i = 0; i < members.length; i++) {
					if (members[i].getAge() > snu) {
						members[i].showInfo();
						System.out.println();
					}
				}
			} else if (c == 4) {
				System.out.println("프로그램을 종료합니다.");
				isTrue = false;
			} else {
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("프로그램을 종료합니다.");
				System.exit(c);
			}

		}
	}
}
