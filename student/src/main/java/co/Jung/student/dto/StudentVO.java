package co.Jung.student.dto;

import java.sql.Date;

public class StudentVO {
	private String studentid;
	private String name;
	private Date birthday;
	private String major;
	private String address;
	private String tel;

	public String getStudentid() {
		return studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		System.out.print(studentid +" : ");
		System.out.print(name +" : ");
		System.out.print(birthday +" : ");
		System.out.print(major +" : ");
		System.out.print(address +" : ");
		System.out.println(tel);
		return null;
	}

	
	

}
