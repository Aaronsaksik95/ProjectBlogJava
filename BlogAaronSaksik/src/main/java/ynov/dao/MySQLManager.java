package ynov.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLManager {
	static MySQLManager instance;

	private Connection connection = null;
	private String url = "jdbc:mysql://localhost:3306/blogJava";
	private String utilisateur = "root";
	private String motDePasse = "mysql";

	public Connection getConnection() {

		return connection;
	}

	public static synchronized MySQLManager getInstance() {

		if (instance == null) {
			instance = new MySQLManager();
		}
		return instance;
	}

	private MySQLManager() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.connection = DriverManager.getConnection(url, utilisateur, motDePasse);

		}

		catch (ClassNotFoundException e) {

		} catch (SQLException e) {

		}

	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// Ignore.
			}
		}
	}
}