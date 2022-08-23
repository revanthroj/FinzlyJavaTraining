package statement_opr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Stmt_Read {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String query = "select * from emp";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getString("ename"));
		}
	}
		
}
