package co.jung.notice.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DataSource {
	private static DataSource dataSource = new DataSource();

	private DataSource() {
	};

	private Connection conn;
	private String driver;
	private String url;
	private String user;
	private String passwd;

	public static DataSource getInstance() {
		return dataSource;
	}

	public Connection getConnection() {
		dbConfig();
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, passwd);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	private void dbConfig() {
		Properties properties = new Properties();
		String resource = getClass().getResource("/db.properties").getPath();
		try {
			properties.load(new FileInputStream(resource));
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			user = properties.getProperty("user");
			passwd = properties.getProperty("passwd");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
