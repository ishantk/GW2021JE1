<%@page import="com.auribises.dao.DB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Action</title>
</head>
<body>

	<center>

	<%
		DB db = new DB();
	
		String action = request.getParameter("action");
		String feverId = request.getParameter("feverid");
		String fever = request.getParameter("fever");
		
		if(action.equals("delete")){
			// delete the fever record
			db.deleteFever(feverId);
	%>
			<h3>Fever Record Deleted</h3>
	<%			
		}else{
			
	%>	
		<h3>UPDATE FEVER</h3>	
		<form action="" method="get">
			<input type="text" name="txtFever" value="<%=fever%>">
			<input type="submit" value="UPDATE FEVER">
		</form>
	<%			// update the fever record
		}
	%>
	</center>

</body>
</html>