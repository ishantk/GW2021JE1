<%@page import="com.auribses.model.Fever"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.auribises.dao.DB"%>
<%@page import="com.auribses.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fevers</title>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</head>
<body>

	<%
		User user = (User)session.getAttribute("keyUser");
		DB db = new DB();
	%>

<%-- 	<center>
		<h3>All Fevers </h3>
		
		<%
			ArrayList<Fever> fevers = db.fetchFevers(user._id);
		
			for(Fever fever : fevers){
				
		%>
			
			Fever: <%= fever.fever %>
			<br/>
			
		<%			
				
			}
		%>
		
	</center> --%>
	
	<div class="container">
  <h2>Fever Record</h2>
  <p>Dear <%= user.name%>, your fever records till date: </p>            
  <table class="table table-striped">
    <thead>
      <tr>
        <th>Date Time</th>
        <th>Fever</th>
        <th>Action</th>
      </tr>
    </thead>
    <tbody>
    
   	   <%
			ArrayList<Fever> fevers = db.fetchFevers(user._id);
		
			for(Fever fever : fevers){
				
		%>
    
	      <tr>
	        <td><%= fever.dateTimeStamp %></td>
	        <td><%= fever.fever %></td>
	        <td><a href='action.jsp?action=update&feverid=<%=fever._id%>&fever=<%=fever.fever%>'>UPDATE</a>  <a href='action.jsp?action=delete&feverid=<%=fever._id%>'>DELETE</a></td>
	      </tr>
	      
      	<%			
				
			}
		%>
    </tbody>
  </table>
</div>
	

</body>
</html>