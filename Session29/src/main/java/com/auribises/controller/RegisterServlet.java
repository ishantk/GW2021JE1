package com.auribises.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.auribises.dao.DB;
import com.auribses.model.User;

@WebServlet({ "/RegisterServlet", "/Register" })
public class RegisterServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. Fetch data from Request
		User user = new User();
		//user.name = request.getParameter("txtName");
		user.setName(request.getParameter("txtName"));
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		//user.makePasswordSecure();
		
		System.out.println(user);
		
		
		// 2. Logical Processing
		//    Dump the data in Mongo DB/ MySQL / FirebaseFirestore
		DB db = new DB();
		
		// 3. Send Back some Response
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		boolean result = db.registerUser(user);
		
		
		if(result) {
			writer.println("Thank You. We have Registered You Successfully");
		}else {
			writer.println("OOPS. Something Went Wrong");
		}
		
		
		
		
	}

}
