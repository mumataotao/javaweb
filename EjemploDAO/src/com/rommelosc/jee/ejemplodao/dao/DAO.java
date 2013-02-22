package com.rommelosc.jee.ejemplodao.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.rommelosc.jee.ejemplodao.factory.ConnectionFactory;
import com.rommelosc.jee.ejemplodao.util.DataBase;

public abstract class DAO {

	protected Connection getConnection(DataBase type) throws SQLException {
		Connection conn;
		conn = ConnectionFactory.createConnection(type);
		
		return conn;
	}
	
}
