package jdbc_ex;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;

/**
 * PreparedStatement is sub interface of sql statement.
 * PreparedStatement is used in jdbc to run sql statements repeatedly.
 * 
 * Advantage of PreparedStatement?
 * 
 * 1)Improves performance: When we are executing the
 * sql Statement  repeatedly, PreparedStatement is faster.
 * The performance of the application will be faster
 * With PreparedStatement because the query is compiled only once. 
 *  Example, we are inserting several rows, one by one.
 * 
 * 2)It is used to execute parameterized query. This statement gives us the
 * flexibility of supplying arguments dynamically.
 * 
 * @author bhaskar
 *
 */
public class PreparedStatementEx {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";

	// Database credentials
	static final String USER = "system";
	static final String PASSWORD = "admin1";

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement prSt = null;

		try {
			// STEP 2: Register JDBC driver
			Class.forName("oracle.jdbc.driver.OracleDriver"); // classes12.jar
			// This loads driver to memory

			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection( // URL from Properties file
					"jdbc:oracle:thin:@localhost:1521:XE", USER, PASSWORD);
			// URL, userName, password

			// STEP 4: Execute a query
			System.out.println("Creating statement...");

			String query = "insert into emp(name,salary) values(?,?)";
			prSt = conn.prepareStatement(query);

			prSt.setString(1, "John");
			prSt.setInt(2, 10000);
			// count will give you how many records got updated
			int count = prSt.executeUpdate();

			// Run the same query with different values
			prSt.setString(1, "Cric");
			prSt.setInt(2, 5000);
			count = prSt.executeUpdate();

			SQLWarning connectionWarning = conn.getWarnings();

			while (connectionWarning != null) {

				String warningMessage = connectionWarning.getMessage();

				String warningSQLState = connectionWarning.getSQLState();

				int warningErrorCode = connectionWarning.getErrorCode();

				System.out.println("Connection warning : " + warningErrorCode
						+ " Message : " + warningMessage + " SQL state "
						+ warningSQLState);

				connectionWarning = connectionWarning.getNextWarning();
			}

		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();

		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (prSt != null)
					prSt.close();
			} catch (Exception ex) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close(); // NullPointerException if null
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try

			conn = null;
			prSt = null;

		} // end try
		System.out.println("Goodbye!");
	}// end main
}// end FirstExample