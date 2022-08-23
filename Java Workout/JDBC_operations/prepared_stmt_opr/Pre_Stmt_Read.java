package prepared_stmt_opr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class Pre_Stmt_Read {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int eid = 1;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("Jdbc:mysql://localhost:3306/test", "root", "root");
		PreparedStatement ps = (PreparedStatement) con.prepareStatement("select ename from emp where eid =?");
		ps.setInt(1,eid);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString(1));
		}
		
	}
}
