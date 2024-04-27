package com.advance.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BasicCalculationServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String val1 = req.getParameter("Input1");
		String val2 = req.getParameter("Input2");

		int result = Integer.parseInt(val1) + Integer.parseInt(val2);
		
		HttpSession session = req.getSession();
		
		session.setAttribute("UserName","Yoshi");
		
		session.setAttribute("result", result);
		
		res.sendRedirect("square");
		
	//Sessions allow for acess level distrinction.)
/*
		req.setAttribute("result", result);
		RequestDispatcher rd = req.getRequestDispatcher("square");
		rd.forward(req, res);
		
		*/

	}

	public void doPostbackup(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String value1 = req.getParameter("Input1");
		System.out.println("Val1 =" + value1);
		String value2 = req.getParameter("Input2");
		System.out.println("Val2 =" + value2);

		int result = Integer.parseInt(value1) + Integer.parseInt(value2);

		System.out.println("Result =" + result);

		PrintWriter out = res.getWriter();
		out.println("<html><body bgcolor='pink'>");
		out.println("Addition is " + result);
		out.println("</body></html>");

	}

	public void doGetbackup(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String value1 = req.getParameter("Input1");
		System.out.println("Val1 =" + value1);
		String value2 = req.getParameter("Input2");
		System.out.println("Val2 =" + value2);

		int result = Integer.parseInt(value1) + Integer.parseInt(value2);

		System.out.println("Result =" + result);

		PrintWriter out = res.getWriter();
		out.println("<html><body bgcolor=\"yellow\">");
		out.println("Addition is " + result);
		out.println("</body></html>");

	}
}
/*
 * 
 * Serlets: An object created at the time of first requestr. -init() -
 * serviuce() -destroy() --- servletconfig: an object created by the
 * webcontainer for each servlet. - Make only when accessing the page.
 * servletcontext: an object created by the webcontainer for each deployment.
 * --- Servlet Methods: -Get: ex: access the data. -Post ex: Registration Forms
 * to store data -Put -Delete ---
 * 
 */