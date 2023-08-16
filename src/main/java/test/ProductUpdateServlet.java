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
@WebServlet("/update")
public class ProductUpdateServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String code5=req.getParameter("code5");
		float price=Float.parseFloat(req.getParameter("price"));
		int qty=Integer.parseInt(req.getParameter("qty"));
		pw.println("code "+code5+"<br>");
		pw.println("price "+price+"<br>");
		RequestDispatcher rd=req.getRequestDispatcher("link.html");
	}
}
