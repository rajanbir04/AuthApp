<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous">
<style>
.signupform {
	overflow: auto;
	margin-top: 100px;
}

p {
	font-weight: bold;
	font-size: 30px;
	color: #0000a0;
	background-color: #cbdaf2;
}

hr {
	background-color: #0000a0;
}
</style>
</head>
<body style="background-image: linear-gradient(to right, #ccffff,#cc99ff);">
	<div class="container col-md-6 col-md-offset-3 signupform" style="background-color:white">
		<div style="background-color: #cbdaf2;">
			<hr>
			<p>&nbsp;&nbsp;Sign Up
			<p>
			<hr>
		</div>
		<form action="signup" method="post">
			<div class="form-group">
				<div class="row">
					<div class="col-sm-2">
						<label for="uname">&nbsp;&nbsp;Username:</label>
					</div>
					<div class="col-sm-1" style="color: red;" align="right">*</div>
					<div class="col-sm-6">
						<input type="text" class="form-control" id="username"
							name="username" required>
					</div>
				</div>
			</div>
			<br>

			<div class="form-group">
				<div class="row">
					<div class="col-sm-2">
						<label for="uname">&nbsp;&nbsp;Password:</label>
					</div>
					<div class="col-sm-1" style="color: red;" align="right">*</div>
					<div class="col-sm-6">
						<input type="password" class="form-control" id="password"
							name="password" required>
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-6 offset-sm-3">
					<a href="login.jsp">Already user, login?</a>
				</div>
			</div>
			<div style="background-color: #cbdaf2; text-align: right;">
				<hr>
				<button
					style="margin-right: 20px; border: solid; border-radius: 5px;"
					type="submit">&nbsp;&nbsp;Sign Up >>&nbsp;&nbsp;</button>
				<hr>
			</div>
		</form>
	</div>
</body>
</html>