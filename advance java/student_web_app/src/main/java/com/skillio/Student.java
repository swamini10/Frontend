package com.skillio;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Student extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	    {
			String rollno = req.getParameter("rn");
			String sname = null;			
			//-------------
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				String url = "jdbc:mysql://127.0.0.1:3306/skillio_db";
		        String username = "root";
		        String password = "root@123";
		        
		        Connection connection = DriverManager.getConnection(url, username, password);
		        Statement st = connection.createStatement();
		        ResultSet rs = st.executeQuery("SELECT * FROM student WHERE rollno = " + rollno);
		        
		        while(rs.next()) {
		            sname = rs.getString("name");
		        	System.out.println("Student Name:- " + rs.getString("name") + "| Student Address:- " + rs.getString("address"));
		        }
		        connection.close();
		        
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
					e.printStackTrace();
				}
			//-------------
			
			
			if(sname != null) {
				req.setAttribute("studentName", "Student name = " + sname);
			} else {
				req.setAttribute("studentName", "Student not found");
			}
			req.getRequestDispatcher("index.jsp").forward(req, resp);
	    }

}
