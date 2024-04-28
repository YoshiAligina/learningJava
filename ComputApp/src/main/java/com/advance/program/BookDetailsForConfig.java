package com.advance.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BookDetailsForConfig extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException 
	{
		PrintWriter out = res.getWriter();
		out.print("book Name is ");
		
		ServletConfig ob1 = getServletConfig();
		String bookName = ob1.getInitParameter("BookName");
		out.println(bookName);
		
		
		String bookPrice = ob1.getInitParameter("BookPrice");
		out.println("Book Price is "+bookPrice);

		ServletContext ob = getServletContext();
		String secondBookName =ob.getInitParameter("SecondBookName");
		out.print("Next book name is "+secondBookName);
	}
}
