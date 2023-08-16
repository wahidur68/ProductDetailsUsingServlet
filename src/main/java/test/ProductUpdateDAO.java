package test;
import java.sql.*;
public class ProductUpdateDAO {
	int k=0;
	public int update(String code,float price) {
		try {
			
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("select * from product51 where code=?");
			PreparedStatement ps2=con.prepareStatement("update product51 set price=price+? where code=?");
			ps.setString(1, code);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				ps2.setFloat(1, price);
				ps2.setString(2,code);
				k=ps2.executeUpdate();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return k;
	}
	public int update(String code,int qty)
	{
		try {
			Connection con=DBConnection.getCon();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return k;
	}

}
