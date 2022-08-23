package prepared_stmt_opr;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.PreparedStatement;

public class Pre_Stmt_Delete {
	public static void main(String[] args) throws Exception {
		String name = "Vijay";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		PreparedStatement ps = (PreparedStatement) con.prepareStatement("DELETE FROM emp WHERE ename = ?");
		
		ps.setString(1, name);
		int r = ps.executeUpdate();
		System.out.println(r);
	}

}
