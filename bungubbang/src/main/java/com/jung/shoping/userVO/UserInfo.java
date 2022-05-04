package com.jung.shoping.userVO;

import java.util.Date;

import lombok.Data;

@Data
public class UserInfo {
	private final String userId;
	private String passWd;
	private String name;
	private int monuy;
	private int point;
	
	
	public UserInfo(String userId, String passWd, String name) {
		super();
		this.userId = userId;
		this.passWd = passWd;
		this.name = name;
	}
	
	
	
}
