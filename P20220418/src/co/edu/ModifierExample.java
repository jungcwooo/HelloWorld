package co.edu;

import co.edu.friend.Friend;

class Friend2 extends Friend {
	public Friend2() {
		super();

		this.getName();
		this.getPhoneNo();
	}
}

public class ModifierExample extends Friend {
	public static void main(String[] args) {
		Friend f = new Friend2();
		f.getPhoneNo();
	}
}
