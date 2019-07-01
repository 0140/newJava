package jdbc_ex;

import java.sql.*;

/**
 * We write JDBC code in DAO class. (DAO Pattern) 
 * 
 * @author bhaskar
 *
 */
public class JdbcExample {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver"; // Classes12.jar
	static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";

	// Database credentials
	static final String USER = "system";
	static final String PASSWORD = "admin1";

	public static void main(String[] args) {
		Connection connection = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// STEP 2: Register JDBC driver
			Class.forName("oracle.jdbc.driver.OracleDriver"); // classes12.jar

			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			connection = DriverManager.getConnection( // URL, userName, password
					"jdbc:oracle:thin:@localhost:1521:XE", USER, PASSWORD);

			// STEP 4: Execute a query
			System.out.println("Creating statement...");
			stmt = connection.createStatement();
			String sql;
			sql = "SELECT empno, ename, hiredate FROM emp";
			rs = stmt.executeQuery(sql); // We  get Resultset

			// STEP 5: Extract data from result set row by row
			while (rs.next()) { // one more row is there in Resultset 
				// Retrieve each column of the row by column name
				int empno = rs.getInt("empno");
				Date hiredate = rs.getDate("hiredate");
				String ename = rs.getString("ename"); 
			 

				// Display values
				System.out.print("ID: " + empno);
				System.out.print(", hiredate: " + hiredate);
				System.out.print(", ename: " + ename);
				System.out.println(""); 
				
			}
			// STEP 6: Clean-up environment
			rs.close();

			connection.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException se2) {
			}// nothing we can do
			
			
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}// end finally try
		}// end try
		System.out.println("Goodbye!");
	}// end main
}// end FirstExample
