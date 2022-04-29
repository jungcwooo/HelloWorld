package co.Jung.student.dao;

import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class DataSource {

	private static DataSource dataSource = new DataSource();
	private DataSource() {};
	
//	private static String driver = "oracle.jdbc.driver.OracleDriver";
//	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
//	private static String user = "jung";
//	private static String passwd = "1234";
	
	private Connection conn;
	private String driver;
	private String url;
	private String user;
	private String passwd;
	
	public static DataSource getInstance() {
		return dataSource;
	}
	
	
	public Connection getConnection() {
		dbconfiguration();
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

	private  void dbconfiguration() { 
		Properties properties = new Properties();
		try {
		String resource = getClass().getResource("/db.properties").getPath();
			properties.load(new FileReader(resource));
//			Reader reader = new FileReader("db.properties");
//			properties.load(reader);
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			user = properties.getProperty("user");
			passwd = properties.getProperty("passwd");
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
