<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change Password</title>
</head>
<body bgcolor="cyan">
	<h1>
		<strong>${username}</strong>Change your password Here
	</h1>
	<br>
	<form action="changepwd.do" method="post">
		<table border="2" width="40%" align="center" cellpadding="20%">
			<tr>
				<td>Enter UserID</td>
				<td><input type="text" name="userid" id="userid" placeholder="Enter User Id"></td>
			</tr>
			<tr>
				<td>Old Password</td>
				<td><input type="password" name="oldpwd" id="oldpwd" placeholder="Enter Old Password"></td>
			</tr>
			<tr>
				<td>New Password</td>
				<td><input type="password" name="newpwd" id="newpwd" placeholder="Enter New Password" ></td>
			</tr>
			<tr>
				<td>Confirm New Password</td>
				<td><input type="password" name="cnewpwd" id="cnewpwd" placeholder="Enter Confirm Password"></td>
			</tr>
			<tr>
			<td></td>
				<td><input type="submit" value="ChangePassword"  class="btn btn-primary"></td>
			</tr>
		</table>

	</form>
</body>
</html>