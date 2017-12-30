<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="css/bootstrap-3.3.7-dist/css"></link>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">
<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<script src="java script/validation.js"></script>
<script src="angular js/angular.js"></script>
<link src="css/bootstrap-3.3.7-dist/js/bootstrap.min.js">


</head>
<body bgcolor="cyan">

	<h1>Welcome To Jspiders</h1>

	<form action="registration.do" method="post" name="registration"
		onsubmit="return formValidation()">
		<table border="2" align="center" width="35%" cellpadding="10%"
			cellspacing="2%">
			<caption style="color: RED">
				<h1>REGISTRATION</h1>
			</caption>
			<tr>
				<td>UserName</td>
				<td><input type="text" name="username" id="username"
					placeholder="Enter User Name"></td>
			</tr>
			<tr>
				<td>EmailId</td>
				<td><input type="text" name="email" id="email"
					placeholder="Enter Email"></td>
			</tr>
			<tr>
				<td>UserId</td>
				<td><input type="text" name="userid" id="userid"
					placeholder="Enter User Id"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" id="password"
					placeholder="Enter Password"></td>
			</tr>
			<tr>
				<td>ConfirmPassword</td>
				<td><input type="password" name="cpassword" id="cpassword"
					placeholder="Enter Password"></td>
			</tr>
			<tr>
				<td>MobileNumber</td>
				<td><input type="text" name="mobileno" id="mobileno"
					placeholder="Enter Mobile Number"></td>
			</tr>
			<tr>
				<td>SecurityQuestion</td>
				<td><select name="question" id="question">
						<option>-----select-----</option>
						<option>favorite hero</option>
						<option>favorite heroine</option>
						<option>favorite food</option>
						<option>favorite teacher</option>
						<option>favorite place</option>
						<option>first love</option>
				</select></td>
			</tr>
			<tr>
				<td>Answer</td>
				<td><input type="text" name="answer" id="answer"
					placehollder="Answer"></td>
			</tr>
			<tr>
				<td>Account Type</td>
				<td><select name="accountType" id="accountType">
						<option>---select---</option>
						<option value="Admin">Admin</option>
						<option value="User">User</option>
				</select></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Register"
					class="btn btn-success"><input type="reset" value="Clear"
					class="btn btn-primary"></td>
			</tr>
			<tr>
				<td><h5>Do You Have Account?</h5></td>
				<td><a href="Login.jsp">Login</a></td>
			</tr>
		</table>
	</form>
</body>
</html>