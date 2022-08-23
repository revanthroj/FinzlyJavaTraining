package prepared_stmt_opr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class Pre_Stmt_Update {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int eid = 3;
		String name = "arjun";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("Jdbc:mysql://localhost:3306/test", "root", "root");
		PreparedStatement ps = (PreparedStatement) con.prepareStatement("UPDATE emp SET ename =? where eid = ?");
		ps.setInt(2,eid);
		ps.setString(1, name);
		ps.executeUpdate();
		System.out.println(ps);
	}
}
