package com.auribises.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet({ "/ServletOne", "/One" })
public class ServletOne extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// name is accessible only in the service method of ServletOne
		// if we wish to share this name to some other Servlet/JSP we need Session Management
		String name = request.getParameter("txtName");
		System.out.println(name);
		
		// Whatever data is extracted from the request
		// can be saved in DataBase :)
		
		response.setContentType("text/html");
//		String htmlResponse = "<html>"
//				+ "<body><center>"
//				+ "<h4>Welcome to Servlet One</h4>"
//				+ "<a href='Two'>Enter Home</a>"
//				+ "</center></body>"
//				+ "</html>";
		
		// 1. Session Management - Cookies
		/*
		// Cookies -> key/value is string
		Cookie cookie = new Cookie("keyName", name);
		//Cookie cookie2 = new Cookie("keyEmail", email);
		
		//cookie.setMaxAge()
		
		// saved in the web browser of client
		response.addCookie(cookie);
		*/
		
		//2. Session Management - URL ReWriting
		
		/*String htmlResponse = "<html>"
				+ "<body><center>"
				+ "<h4>Welcome to Servlet One</h4>"
				+ "<a href='home.jsp?name="+name+"&age=20'>Enter Home</a>"
				//+ "<a href='Two?name="+name+"&age=20'>Enter Home</a>"
				+ "</center></body>"
				+ "</html>";*/
		
		/*String htmlResponse = "<html>"
				+ "<body><center>"
				+ "<h4>Welcome to Servlet One</h4>"
//				+ "<form action='Two' method='post'>"
				+ "<form action='home.jsp' method='post'>"
				+ "<input type='hidden' name='txtHiddenName' value='"+name+"'>"
				+ "<input type='hidden' name='txtHiddenAge' value='30'>"
				+ "<input type='submit' value='ENTER HOME'>"
				+ "</form>"
				+ "</center></body>"
				+ "</html>";*/
		
		HttpSession session = request.getSession();
		session.setAttribute("keyName", name);
		session.setAttribute("keyAge", 30);
		//session.setAttribute("keyUser", user);
		
		String htmlResponse = "<html>"
				+ "<body><center>"
				+ "<h4>Welcome to Servlet One</h4>"
				+ "<a href='home.jsp'>Enter Home</a>"
//				+ "<a href='Two'>Enter Home</a>"
				+ "</center></body>"
				+ "</html>";
		
		// clear all the data in Session Object
		//session.invalidate();
		
		PrintWriter out = response.getWriter();
		out.println(htmlResponse);
		
	}

}
