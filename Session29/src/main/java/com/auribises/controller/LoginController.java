package com.auribises.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.auribises.dao.DB;
import com.auribses.model.User;


@WebServlet({ "/LoginController", "/Login" })
public class LoginController extends HttpServlet {


	public void init(ServletConfig config) throws ServletException {
		System.out.println("[LoginController] - init executed");
	}

	public void destroy() {
		System.out.println("[LoginController] - destroy executed");
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[LoginController] - service executed");
		
		// 1. Fetch Data in REQUEST: request.getParameter -> will always return String
															// 	if needed convert it to integer or any other type of your choice
		User user = new User();
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		System.out.println(user);
		
		// 2. Perform some Logical Operation
		
		DB db = new DB();
		boolean result = db.loginUser(user);
		
		
		
		// 3. Send RESPOSNE to client ->  Either Text or HTML
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		
		//String message = "Thank You "+user.name;
		String html = "";
		if(result) {
			html = "<html><body><center>THANK YOU "+user.email+"<br>Login Success</center></body></html>";
		}else {
			html = "<html><body><center>Invalid Credentials"+user.email+"<br>Please try Again</center></body></html>";
		}
		
		//writer.println(message);
		writer.println(html);
		
		
		
	}

}
