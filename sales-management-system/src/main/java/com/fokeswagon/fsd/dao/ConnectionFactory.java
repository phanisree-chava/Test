package com.fokeswagon.fsd.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public static Connection getconnection() throws SQLException
	{
	   return DriverManager.getConnection("jdbc:mysql://localhost:3306/imsDb","root","root");
	}
}