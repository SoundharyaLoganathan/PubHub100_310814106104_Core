package com.bookapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException{
		
	
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/bookapp_db";
		String username ="root";
		String password ="root";
		Connection connection = DriverManager.getConnection(url, username, password);
		
		return connection;
		
	}

}
