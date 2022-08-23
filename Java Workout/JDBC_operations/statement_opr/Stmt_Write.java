package statement_opr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Stmt_Write {
	public static void main(String[] args) throws Exception {
		String query = "insert into emp(eid,ename) values(7,'ram')";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("Jdbc:mysql://localhost:3306/test", "root", "root");
		Statement stmt =  con.createStatement();
		int update = stmt.executeUpdate(query);
		System.out.println(update);
	}
}
