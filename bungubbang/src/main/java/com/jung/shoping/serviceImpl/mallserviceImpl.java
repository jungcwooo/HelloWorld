package com.jung.shoping.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jung.shoping.dao.DataSource;
import com.jung.shoping.service.mallservice;

public class mallserviceImpl implements mallservice {
	private Connection conn = DataSource.getConnection(); // connection연결
	private PreparedStatement psmt; // sql 명령실행
	private ResultSet rs; // select 결과 담음
	
	
}
