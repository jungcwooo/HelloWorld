package co.edu.myself;

public class BankList {
	String name;
	int nember;
	int passwd;
	int money;

	BankList() {
	}

	BankList(String name, int nember,int passwd,int money) {
		this.name = name;
		this.passwd = passwd;
		this.nember = nember;
		this.money = money;
	}

	BankList(String name,int passwd, int money) {
		this.name = name;
		this.passwd = passwd;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNember() {
		return nember;
	}

	public void setNember(int nember) {
		this.nember = nember;
	}

	public int getPasswd() {
		return passwd;
	}

	public void setPasswd(int passwd) {
		this.passwd = passwd;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}
