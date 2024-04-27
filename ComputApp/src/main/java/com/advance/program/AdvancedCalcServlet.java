package com.advance.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AdvancedCalcServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		HttpSession session = req.getSession();
		int n = (int)session.getAttribute("result");
		String userName = (String) session.getAttribute("UserName");
		
		System.out.println("UserName - "+userName);
		
		int output = n * n;
		PrintWriter out = res.getWriter();
		out.print("SquarED VALUE IS " + output);
		
		
	/*	int n = (int) req.getAttribute("result");
		System.out.println("Addition is " + n);
 */
	}
}

// First servlet class is attempting to 