package com.advance.program;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BasicCalculationServlet extends HttpServlet
{
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String value1 = req.getParameter("Input1");
		System.out.println("Val1 ="+ value1);
		String value2 = req.getParameter("Input2");
		System.out.println("Val2 ="+ value2);
		
		int result = Integer.parseInt(value1) + Integer.parseInt(value2);
		
		System.out.println("Result ="+ result);
		
		PrintWriter out = res.getWriter();
		out.println("<html><body bgcolor='pink'>");
		out.println("Addition is "+result);
		out.println("</body></html>");
		

	}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String value1 = req.getParameter("Input1");
		System.out.println("Val1 ="+ value1);
		String value2 = req.getParameter("Input2");
		System.out.println("Val2 ="+ value2);
		
		int result = Integer.parseInt(value1) + Integer.parseInt(value2);
		
		System.out.println("Result ="+ result);
		
		PrintWriter out = res.getWriter();
		out.println("<html><body bgcolor=\"yellow\">");
		out.println("Addition is "+result);
		out.println("</body></html>");
		

	}
}
/*
 * 
Serlets: An object created at the time of first requestr.
-init()
- serviuce()
-destroy()
---
servletconfig: an object created by the webcontainer for each servlet.
- Make only when accessing the page.
servletcontext: an object created by the webcontainer for each deployment.
---
Servlet Methods:
-Get: ex: access the data.
-Post ex: Registration Forms to store data
-Put
-Delete
--- 

 */