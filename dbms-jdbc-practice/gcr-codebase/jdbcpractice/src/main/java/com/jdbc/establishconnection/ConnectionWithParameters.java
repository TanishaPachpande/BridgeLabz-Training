package com.jdbc.establishconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionWithParameters {

	public static Connection getConnection() throws SQLException {

		String url = "jdbc:mysql://localhost:3306/jdbc_practice";

		// connection properties
		Properties properties = new Properties();
		properties.setProperty("user", "root");
		properties.setProperty("password", "mysql@123");
		properties.setProperty("useSSL", "false");
		properties.setProperty("serverTimezone", "UTC");
		properties.setProperty("allowPublicKeyRetrievel", "true");

		return DriverManager.getConnection(url, properties);
	}

	public static void main(String[] args) throws SQLException {
		Connection conn = getConnection();
		if (conn != null) {

			try {
				conn.close();
				System.out.println("Connection closed!");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}