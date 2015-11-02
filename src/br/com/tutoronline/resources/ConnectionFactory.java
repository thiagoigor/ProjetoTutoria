package br.com.tutoronline.resources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private String url = "jdbc:mysql://localhost:3306/tutor_online";
	private String username = "root";
	private String password = "root";

	public Connection getConnection() {
		try {
			// registra o driver JDBC
			Class.forName("com.mysql.jdbc.Driver");

			return DriverManager.getConnection(this.url, this.username, this.password);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
}
