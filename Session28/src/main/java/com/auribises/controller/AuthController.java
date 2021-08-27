package com.auribises.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.auribises.dao.DB;
import com.auribises.model.Admin;


@WebServlet({ "/AuthController", "/auth" })
public class AuthController extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Admin admin = new Admin();
		admin.email = request.getParameter("txtEmail");
		admin.password = request.getParameter("password");
		
		System.out.println("ADMIN:"+admin);
		
		DB db = new DB();
		db.fetchUsers();
		
	}

}
