package prepared_stmt_opr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Pre_Stmt_Write {
	public static void main(String[] args) throws Exception {
		int id = 1;
		String name = "Vijay";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("Jdbc:mysql://localhost:3306/test", "root", "root");
		PreparedStatement ps = con.prepareStatement("INSERT INTO emp (eid,ename) VALUES(?,?)");
		
		ps.setInt(1, id);
		ps.setString(2, name);
		int r = ps.executeUpdate();
		System.out.println(r);
	}
}
