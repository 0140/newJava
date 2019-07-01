package jdbc_ex;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * CallableStatement is used to invoke 
 * database procedures and functions from Java JDBC Code.
 * 
 * Suppose, you need to execute the following Oracle stored procedure −
 * 
 * CREATE OR REPLACE PROCEDURE 
 * getEmpName (EMP_ID IN NUMBER, EMP_FIRST OUT VARCHAR)
 *  AS
 *   BEGIN 
 *   SELECT first INTO EMP_FIRST FROM Employees WHERE ID =
 *   EMP_ID; 
 * END;
 * 
 * Three types of parameters exist: IN, OUT, and INOUT. The PreparedStatement
 * object only uses the IN parameter. The CallableStatement object can use all
 * the three.
 * 
 * Here are the definitions of each −
 * 
 * Parameter Description IN A parameter whose value is unknown when the SQL
 * statement is created. You bind values to IN parameters with the setXXX()
 * methods. OUT A parameter whose value is supplied by the SQL statement it
 * returns. You retrieve values from theOUT parameters with the getXXX()
 * methods. INOUT A parameter that provides both input and output values. You
 * bind variables with the setXXX() methods and retrieve values with the
 * getXXX() methods.
 *
 * @author bhaskar
 *
 */
public class CallableStatementEx {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";

	// Database credentials
	static final String USER = "system";
	static final String PASSWORD = "admin1";
	transient Connection con2 = null; // An example of transient.

	public static void main(String[] args) {
			Connection conn = null;
			CallableStatement callableStatement = null;
			ResultSet rs = null;

			try {
				// STEP 2: Register JDBC driver
				Class.forName("oracle.jdbc.driver.OracleDriver"); // classes12.jar
				// This loads driver to memory

				// STEP 3: Open a connection
				System.out.println("Connecting to database...");
				conn = DriverManager.getConnection( // URL from Properties file
						"jdbc:oracle:thin:@localhost:1521:XE", USER, PASSWORD); 
				//URL, userName, password

				// STEP 4: Execute a query
				System.out.println("Creating statement...");
				String SQL = "{call getEmpName (?, ?)}";
				callableStatement = conn.prepareCall(SQL);
				callableStatement.registerOutParameter(1,  OracleTypes.CURSOR );
				callableStatement.execute();
				// get cursor and cast it to ResultSet
				  rs = (ResultSet) callableStatement.getObject(1);
				  // while loop to read rows from result set.
			} catch (SQLException se) {
				// Handle errors for JDBC
				se.printStackTrace();
			} catch (Exception e) {
				// Handle errors for Class.forName
				e.printStackTrace();
			} finally {
				// finally block used to close resources
				try {
					if (callableStatement != null)
						callableStatement.close();
					rs.close(); // result set clode
				} catch (SQLException se2) {
				}// nothing we can do
				try {
					if (conn != null)
						conn.close(); // NullPointerException if null
				} catch (SQLException se) {
					se.printStackTrace();
				}// end finally try
				
				conn = null;
				callableStatement = null;
				rs = null;
				
			}// end try
			System.out.println("Goodbye!");
		}// end main
	}// end FirstExample