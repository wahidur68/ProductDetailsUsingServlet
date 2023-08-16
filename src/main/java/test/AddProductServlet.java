package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@SuppressWarnings("serial")

@WebServlet("/add")
public class AddProductServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		ProductBean pb=new ProductBean();
		pb.setCode(req.getParameter("code"));
		pb.setName(req.getParameter("name"));
		pb.setPrice(Float.parseFloat(req.getParameter("price")));
		pb.setQty(Integer.parseInt(req.getParameter("qty")));
		
		AddProductDAO apd=new AddProductDAO();
		
		int k=0;
		try {
			k = apd.insert(pb);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(k>0) {
			pw.println("Product added successfully......"+"<br>");
			RequestDispatcher rd=req.getRequestDispatcher("link.html");
			rd.include(req, res);
		}
		
	}

}
