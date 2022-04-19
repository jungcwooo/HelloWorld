package co.edu.collection;

import java.util.ArrayList;

// 배열 vs 컬렉션
// 배열을 활용한 프로그램을 작성하고, 컬렉션을 활용한 프로그램 작성
// 공통된 규칙을 지정하고 싶으면 인터페이스를 선언 > 구현하는 클래스.
public class ArrayExample {
	public static void main(String[] args) {
		// 배열은 크기가 변경이 불가하다.
		Friend[] friendAry = new Friend[10];
		friendAry[0] = new Friend("아길동", "010-3333-6666");
		friendAry[1] = new Friend("징길동", "010-3223-6556");
		friendAry[0] = null;

		for (int i = 0; i < friendAry.length; i++) {
			if (friendAry[i] != null) {
				System.out.println(friendAry[i].toString());
			}
		}

		//컬렉션 활용. 인터페이스 => List:컬렉션 => ArrayList
		ArrayList friendList = new ArrayList();
		friendList.add(new Friend("고길동","010-2223-1234"));	// 추가
		friendList.add(new Friend("주길동","010-2512-5152"));
		friendList.remove(1);	// 삭제
		
		for (int i = 0; i < friendList.size(); i++) {
		
				System.out.println(friendList.get(i));
			
		}
	
		Friend f2 = (Friend)friendList.get(0);
		System.out.println();
		System.out.println(f2);
	
	}
}
