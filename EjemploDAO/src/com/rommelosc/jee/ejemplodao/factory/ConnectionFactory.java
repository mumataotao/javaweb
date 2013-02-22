package com.rommelosc.jee.ejemplodao.factory;

import java.sql.Connection;
import java.sql.SQLException;

import com.rommelosc.jee.ejemplodao.util.DataBase;

public class ConnectionFactory {

	public static Connection createConnection(DataBase type)
			throws SQLException {

		switch (type) {
		case MYSQL:
			return new MySQLConnection().getConnection();

		case ORACLE:
			return null;

		case SQLSERVER:
			return null;

		default:
			throw new IllegalArgumentException("No such type");
		}

	}

}
