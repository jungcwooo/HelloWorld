package co.edu.App;

import co.edu.Board;

public class Account {
	// 계좌번호, 예금주, 잔액
	private Account[] acc = new Account[5];

	private final String bankNumber; // 계좌번호
	private final String bankName; // 예금주
	private int money = 0; // 잔액
	private int passwd; // 비밀번호

	// 생성자

	Account(String bankNumber, String bankName, int money, int passwd) {
		this.bankNumber = bankNumber;
		this.bankName = bankName;
		this.money = money;
		this.passwd = passwd;
	}

	// getter , setter
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getPasswd() {
		return passwd;
	}

	public void setPasswd(int passwd) {
		this.passwd = passwd;
	}

	public String getBankNumber() {
		return bankNumber;
	}

	public String getBankName() {
		return bankName;
	}



	public void getSearchInfo() {
		System.out.printf("%6s %10s %-20d %-10d\n", this.bankNumber, this.bankName, this.money, this.passwd);
	}
	
	
	
}
