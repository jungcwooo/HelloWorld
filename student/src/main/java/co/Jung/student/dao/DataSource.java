package co.Jung.student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {
	private static Connection conn;

	private DataSource() {};

	private static String driver = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String user = "jung";
	private static String passwd = "1234";

	public static Connection getConnection() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, passwd);
			System.out.println("DB 연결 성공!!!!!!!!!!!!!!!");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("ㅋㅋ실퍀ㅋㅋ");
		}
		return conn;
	}

}
