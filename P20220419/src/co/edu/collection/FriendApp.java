package co.edu.collection;

import java.util.Scanner;

// 친구 목록저장하기 위한 App.
// 추가, 수정, 삭제, 조회
// 1) 배열 2) 컬렉션 <= 인터페이스 구현
public class FriendApp {
	public static void main(String[] args) {
//		FriendService service = new FriendServiceArray();
		FriendService service = new FriendServiceList();

		// 추가, 수정, 삭제, 조회 => 컨트롤 역할.

		while (true) {

			int menu = 0;
			Scanner scn = new Scanner(System.in);
			System.out.println("1. 추가 2. 수정 3. 삭제 4. 조회 5. 전체조회 6.성별조회");
			menu = scn.nextInt();

			if (menu == 1) {
				service.addFriend();
			} else if (menu == 2) {
				service.modFriend();
			} else if (menu == 3) {
				service.remFriend();
			} else if (menu == 4) {
				service.findFriend2();
			} else if (menu == 5) {
				service.findFriend();
			} else if (menu == 6) {
				
				service.findGender();
				
			} else {
				break;
			}

		}
	}
}
