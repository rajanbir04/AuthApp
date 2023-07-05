<%@ page import="java.util.List"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="javax.servlet.http.HttpSession"%>
<%@page import="org.hibernate.query.Query"%>
<%@page import="java.util.*"%>
<%@page import="java.io.*"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TShirt Search</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous">
<style>
.searchform {
	overflow: auto;
	margin-top: 50px;
}

p {
	font-weight: bold;
	font-size: 20px;
	color: #0000a0;
	background-color: #cbdaf2;
}

hr {
	background-color: #0000a0;
}
</style>
</head>
<body style="background-image: linear-gradient(to right, #ccffff,#cc99ff);">
<%
	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	response.setHeader("Pragma", "no-cache");
	response.setHeader("Expires", "0");
	%>
	<br>
	<%
		String usernameA = (String) session.getAttribute("username");
	if(usernameA == null){
		response.sendRedirect("login.jsp");
	}
	%>
	<div class="container col-md-8 col-md-offset-2 searchform" style="background-color:white">
	<br>
		<div class="row" style="background-color: #cbdaf2; margin-left: 4px; margin-right: 4px">
			<div class="col-md-4 offset-md-4">
				<hr>
				<p>&nbsp;&nbsp;Welcome to the application
				<p>
				<hr>
			</div>

			<div class="col-md-2" align="right">
				<br>
				<p style="color: black; font-weight: normal;">
					Hi
					<%=usernameA%></p>
			</div>
			<div class="col-md-1" align="right">
				<form action="logout" method="post">
					<br> <input type="submit" value="Logout"
						style="border: solid; border-radius: 5px">
				</form>
				<br>
				<br>
			</div>
		</div>
		<br>
	</div>
</body>
</html>