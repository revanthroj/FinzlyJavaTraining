package statement_opr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Stmt_Update{
	public static void main(String[] args) throws Exception {
		String query = "update emp set ename = 'raju' where eid = 6";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		Statement stmt = con.createStatement();
		stmt.executeUpdate(query);
		
	}
}	
