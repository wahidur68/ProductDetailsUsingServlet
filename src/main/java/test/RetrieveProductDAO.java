package test;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
public class RetrieveProductDAO {
	ArrayList<ProductBean> al=new ArrayList<ProductBean>();
	public ArrayList<ProductBean> retrieve(){
		try {
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("select * from product51");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				ProductBean pb=new ProductBean();
				pb.setCode(rs.getString(1));
				pb.setName(rs.getString(2));
				pb.setPrice(rs.getFloat(3));
				pb.setQty(rs.getInt(4));
				al.add(pb);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return al;
	}
}
