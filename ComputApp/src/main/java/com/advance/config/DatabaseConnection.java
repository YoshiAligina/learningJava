package com.advance.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection
{
	public static Connection InitializeDatabase() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String jdbcURL = "jdbc:mysql://localhost:3306/bookmgmt";
		String username = "root";
		String password = "admin";
		
		Connection con = DriverManager.getConnection(jdbcURL,username,password);
		
		
		return con;
	}
}
