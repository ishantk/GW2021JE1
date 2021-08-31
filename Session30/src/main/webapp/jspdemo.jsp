<%@ page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP DEMO</title>
</head>
<body>

	<!-- Declarative Tag -->	
	<%!
		int a = 10;
	
		void hello(){
			System.out.println("This is hello");
		}
		
		class User{
			
		}
		
		ArrayList<String> names = new ArrayList<String>();
		
	%>
	
	<%
		names.add("John");
		names.add("Kim");
		names.add("Mike");
		names.add("Sia");
	%>
	
	<%
		for(String name : names){
	%>
		
		<h4><%= name %></h4>
		<%-- <h4><% out.println(name); %></h4> --%>
		
	<% 			
		}
	%>
	

	<h3>Welcome to JSP</h3>

	<!-- Scriptlet -->
	<%
		for(int i=0;i<=10;i++){
			//System.out.println("i is: "+i);
			// Implicit Object
			out.println(i+"<br>");			
		}
	%>
	
	<!-- Expression : out.println() where out is refereing to PrintWriter Object of response-->
	<h3>a is: <%= a %></h3>
	
	<%
		
	
	%>

</body>
</html>