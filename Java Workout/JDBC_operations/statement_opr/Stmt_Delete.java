package statement_opr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Stmt_Delete {
	public static void main(String[] args) throws Exception {
		String query = "DELETE FROM emp WHERE ename = 'Anand'";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		Statement stmt = con.createStatement();
		int r = stmt.executeUpdate(query);
		System.out.println(r);
	}
}
