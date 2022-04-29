package co.Jung.student.dto;

import java.sql.Date;

import lombok.Data;
@Data
public class StudentVO {
	private String studentid;
	private String name;
	private Date birthday;
	private String major;
	private String address;
	private String tel;


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
