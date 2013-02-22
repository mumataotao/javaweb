package com.rommelosc.jee.ejemplodao.factory;

import java.sql.Connection;
import java.sql.SQLException;

public interface MyConnection {

	public Connection getConnection() throws SQLException;
	
}
