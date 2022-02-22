package com.createiq;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcDemo {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbcdemo","root","root");
	}

}
