package com.advance.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.advance.config.DatabaseConnection;

public class GetBookDetails extends HttpServlet 
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		ArrayList<String> data = new ArrayList<>();
		try
		{
			Connection con = DatabaseConnection.InitializeDatabase();
			
			PreparedStatement st = con.prepareStatement("Select book_name from book_details");
			
			ResultSet resultset = st.executeQuery();
			
			while(resultset.next())
			{
				String bookName = resultset.getString("book_name");
				data.add(bookName);
			}
			
			PrintWriter out = res.getWriter();
			
			out.println("Book Names are "+ data);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}

/* 

Spring Intro:

- It is used because it contains both Spring and JDBC within it, less downloaded. 
- Lightweight, loosely coupled and integrated framework for developing enterprise applications in Java.
- Test ob = new test(); - > Tightly coupled.
- Test ob; -> loosley coupled.

- Advantages:
  - Predefined Templates. : Spring provides templatesd for JDBC , Hibernate, and JPA
  - Loose Coupling: Because of Dependency Injection.
  - Lightweight: Because of its POJO(Plain Old Jaba Object)
- Modules
	- Test
	- Spring Core
	- AOP - Aspect Oriented Programming
	- Data Access / Integration
	- Web 

  
*/

