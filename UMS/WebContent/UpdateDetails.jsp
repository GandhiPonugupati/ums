<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
<title>Update details</title>
</head>
<body bgcolor="cyan">
	<h1>Update Details Here...</h1>
	<form action="updatedetails.do" method="post">
		<table>
			<tr>
				<td>UserName</td>
				<td><input type="text" name="username" id="username"
					placeholder="Enter User Name" value="${dto.username}"></td>
			</tr>
			<tr>
				<td>EmailId</td>
				<td><input type="text" name="email" id="email"
					placeholder="Enter Email Id" value="${dto.email}"
					readonly="readonly"></td>
			</tr>
			<tr>
				<td>UserId</td>
				<td><input type="text" name="userid" id="userid"
					placeholder="Enter User Id" value="${dto.userid}"
					readonly="readonly"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" id="password"
					placeholder="Enter Password" value="${dto.password}"></td>
			</tr>
			<tr>
				<td>confirmPassword</td>
				<td><input type="password" name="cpassword" id="cpassword"
					placeholder="Enter Confirm Password" value="${dto.cpassword}"></td>
			</tr>
			<tr>
				<td>MobileNumber</td>
				<td><input type="text" name="mobileno" id="mobileno"
					placeholder="Enter Mobile Number" value="${dto.mobileno}"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Update" class="btn btn-info"><input
					type="reset" value="Cancel" class="btn btn-success"></td>
			</tr>
		</table>
	</form>

</body>
</html>