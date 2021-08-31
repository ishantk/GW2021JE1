<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="error.jsp" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Authentication</title>
</head>
<body>
	<center>We will Authenticate You here</center>
	
	<%
	
		// request and response -> Implicit Objects :)
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		Integer.parseInt(email);
	
	%>
	
</body>
</html>