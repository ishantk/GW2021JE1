<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>

<center>

	<%!
		String name = "NA";
	%>
	
	<%
		/*Cookie[] cookies = request.getCookies();
		
		for(Cookie cookie : cookies) {
			if(cookie.getName().equals("keyName")) {
				name = cookie.getValue();
			}
		}*/
		
		
	%>
	
	<%-- <h3>NAME IS: <%= name %></h3> --%>
	
	<%-- <h3>NAME IS: <%= request.getParameter("name") %></h3>
	<h3>AGE IS: <%= request.getParameter("age") %></h3> --%>
	
	<%-- <h3>NAME IS: <%= request.getParameter("txtHiddenName") %></h3>
	<h3>AGE IS: <%= request.getParameter("txtHiddenAge") %></h3> --%>
	
	<h3>NAME IS: <%= session.getAttribute("keyName") %></h3>
	<h3>AGE IS: <%= session.getAttribute("keyAge") %></h3>

</center>

</body>
</html>