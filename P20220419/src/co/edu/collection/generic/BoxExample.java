package co.edu.collection.generic;

import java.util.ArrayList;

import co.edu.collection.Friend;

class Orange {
	
}

public class BoxExample {
	 public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.setField("Orange");
		// 반환티입이 Object라 String으로 받기 위해선 형변환을 해야한다. 
		String result = box.getField();
		
		Box<Integer> box2 =new Box<Integer>();
		box2.setField(10);
		int result2 = box2.getField();
		
		System.out.println(result);
		System.out.println(result2);
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("정철우");
//		list.add(10); // 제네릭으로 String을 지정했기 때문에 int는 사용이 불가하다.
		
		ArrayList<Friend> friends = new ArrayList<Friend>();
		friends.add(new Friend("정철우", "010-3753-6703"));
	 
	 }
}
