package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@SuppressWarnings("serial")

@WebServlet("/delete")
public class ProductDeletServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
				
		 String cod2=req.getParameter("code2");
		
		 ProductDeleteDAO ob=new ProductDeleteDAO();
		
		try {
			int k=ob.delete(cod2);
			if(k>0) {
				pw.println("products deleted successfully "+"<br>");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher rd=req.getRequestDispatcher("link.html");
		rd.include(req, res);
	}

	

}
