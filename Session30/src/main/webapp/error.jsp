<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error</title>
</head>
<body>

	<center>
	
		<h3>OOPS! Something Went Wrong</h3>
		<h4>MESSAGE: <%= exception %></h4>
	</center>

</body>
</html>