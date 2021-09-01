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

@WebServlet({ "/ServeletTwo", "/Two" })
public class ServeletTwo extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		String name = request.getParameter("name");
//		String age = request.getParameter("age");
		
//		String name = request.getParameter("txtHiddenName");
//		String age = request.getParameter("txtHiddenAge");
		
		HttpSession session = request.getSession();
		String name = (String)session.getAttribute("keyName");
		int age = (int)session.getAttribute("keyAge");
		
		/*String name = "NA";
		
		Cookie[] cookies = request.getCookies();
		
		for(Cookie cookie : cookies) {
			if(cookie.getName().equals("keyName")) {
				//cookie.setValue(""); // if we wish to remove the name from Cookie
				name = cookie.getValue();
			}
		}*/
		
		response.setContentType("text/html");
		
		String htmlResponse = "<html>"
				+ "<body><center>"
				+ "<h4>Welcome to Servlet Two</h4>"
				+ "Name is:"+name
				+ "<br>Age is:"+age
				+ "</center></body>"
				+ "</html>";
		
//		PrintWriter out = response.getWriter();
//		out.println(htmlResponse);
		
		response.getWriter().println(htmlResponse);
		
	}

}
