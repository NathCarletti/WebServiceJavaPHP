package br.com.inatel.projeto;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {
	public Connection getConnection() throws Exception{
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/dm107", "root", "");
	}
}
