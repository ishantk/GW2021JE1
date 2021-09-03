<%@page import="com.auribises.dao.DB"%>
<%@page import="com.auribses.model.Fever"%>
<%@page import="com.auribses.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Fever</title>
</head>
<body>

	<%
		User user = (User)session.getAttribute("keyUser");
	%>

	<center>
		<h4>Welcome to Fever Management</h4> 
		<b><%= user.name %></b>
	

	<%
		
		Fever fever = new Fever();
		fever.userId = user._id;
		fever.fever = Double.parseDouble(request.getParameter("txtFever"));
		
		DB db = new DB();
		db.logFever(fever);
		
	%>
	
	<p>Your Fever has been Recorded Successfully: <%= fever.fever %></p>
	
	
	
	</center>
	

</body>
</html>