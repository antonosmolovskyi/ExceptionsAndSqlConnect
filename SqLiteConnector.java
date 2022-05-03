package classwork13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqLiteConnector {
	public Connection getConnection() {
		try {
			Class.forName("org.sqlite.JDBC").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:sqlite:C://Users//tonyo//Desktop//SqLiteitea.db");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
