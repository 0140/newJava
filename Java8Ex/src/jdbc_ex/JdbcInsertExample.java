package jdbc_ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class JdbcInsertExample {

	// Database credentials
	static final String USER = "username";
	static final String PASSWORD = "password";

	private static final DateFormat dateFormat = new SimpleDateFormat(
			"yyyy/MM/dd HH:mm:ss");

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		String insertTableSQL = "INSERT INTO DBUSER"
				+ "(USER_ID, USERNAME, CREATED_BY, CREATED_DATE) " + "VALUES"
				+ "(1,'ram','system', " + "to_date('" + getCurrentTimeStamp()
				+ "', 'yyyy/mm/dd hh24:mi:ss'))";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:fci_db", USER, PASSWORD);

			stmt = conn.createStatement();

			System.out.println(insertTableSQL);

			// execute insert SQL stetement
			int noOfRowsAffected = stmt.executeUpdate(insertTableSQL);

			System.out.println("Record is inserted into DBUSER table!"
					+ " noOfRowsAffected:" + noOfRowsAffected);
			
			conn.commit();

		} catch (SQLException e) {

			System.out.println(e.getMessage());
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				conn = null;
			}

		}

	}

	private static String getCurrentTimeStamp() {

		java.util.Date today = new java.util.Date();
		return dateFormat.format(today.getTime());

	}

}
