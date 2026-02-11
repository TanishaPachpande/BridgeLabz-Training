package com.jdbc.establishconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * DatabaseConnectionSingleton
 * ---------------------------
 * This class implements Singleton Pattern for creating
 * only one database connection instance.
 */

public class DatabaseConnectionSingleton {

	// Step 1: Create static instance variable
	private static DatabaseConnectionSingleton instance;

	// Step 2: Create Connection object
	private Connection connection;

	// Database credentials
	private static final String URL = "jdbc:mysql://localhost:3306/jdbc_practice";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "mysql@123";

	/*
	 * Step 3: Private Constructor Prevents object creation from outside class
	 */
	private DatabaseConnectionSingleton() throws SQLException {

		try {
			// Load MySQL Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Establish connection
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			System.out.println("Database Connected Successfully!");

		} catch (ClassNotFoundException e) {
			throw new SQLException("MySQL JDBC Driver Not Found.", e);
		}
	}

	/*
	 * Step 4: Public method to get instance Ensures only one object is created
	 */
	public static synchronized DatabaseConnectionSingleton getInstance() throws SQLException {

		if (instance == null || instance.getConnection().isClosed()) {
			instance = new DatabaseConnectionSingleton();
		}

		return instance;
	}

	/*
	 * Step 5: Getter method for Connection
	 */
	public Connection getConnection() {
		return connection;
	}

	/*
	 * Step 6: Close connection method
	 */
	public void closeConnection() throws SQLException {

		if (connection != null && !connection.isClosed()) {
			connection.close();
			System.out.println("Database Connection Closed.");
		}
	}

	/*
	 * Step 7: Main method for testing
	 */
	public static void main(String[] args) {

		try {

			// Get Singleton Instance
			DatabaseConnectionSingleton dbInstance = DatabaseConnectionSingleton.getInstance();

			// Get connection
			Connection conn = dbInstance.getConnection();

			// Create Statement
			Statement stmt = conn.createStatement();

			// Example Query
			String query = "SELECT NOW()";

			ResultSet rs = stmt.executeQuery(query);

			// Display Result
			while (rs.next()) {
				System.out.println("Current Date & Time from DB: " + rs.getString(1));
			}

			// Close resources
			rs.close();
			stmt.close();
			dbInstance.closeConnection();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}