package com.rommelosc.jee.ejemplodao.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection implements MyConnection{

	private String driverClassName = "com.mysql.jdbc.Driver";
	private String connectionUrl = "jdbc:mysql://localhost:3306/testdao";
	private String dbUser = "root";
	private String dbPwd = "linux";
	
	@Override
	public Connection getConnection() throws SQLException {
		
		try {
			Class.forName(driverClassName);
		} catch (ClassNotFoundException e) {
			System.out.println("Error al obtener el Driver: "+e.getMessage());
			e.printStackTrace();
		}
		
		return DriverManager.getConnection(connectionUrl, dbUser, dbPwd);		
	}

	

	
}
