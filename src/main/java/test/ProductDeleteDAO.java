package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDeleteDAO {
	public int k=0;
	public 	int delete(String code1) throws SQLException {
		Connection con=DBConnection.getCon();
		PreparedStatement ps=con.prepareStatement("delete from product51 where code=?");
		ps.setString(1, code1);
		k=ps.executeUpdate();
		return k;
	}
}
