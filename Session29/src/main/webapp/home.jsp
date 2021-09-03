<%@ page import="com.auribses.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>

	<%
		User user = (User)session.getAttribute("keyUser");
	%>

	<center>
		<h3>Welcome Home, Dear <%= user.name %></h3>
		<h4><%= user.email %></h4>
	
		<h3>Log Your Fever Details Here</h3>
		<a href="viewfevers.jsp">VIEW ALL FEVER RECORDS</a>
		<br><br>
		
		<form action="addfever.jsp" method="get">
			<input type="text" name="txtFever" val="eg: 98.4">
			<input type="submit" value="LOG FEVER">
		</form>
		
		<br>
		
		<table>
		</table>
		
	</center>

</body>
</html>