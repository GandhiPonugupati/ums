<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View</title>
</head>
<body bgcolor="cyan">


<%-- <c: forEach items="${users}" var="user">
      <tr>
          <td>
              <c: out value="${user.userId}"/>
          </td>
          <td>
              <c: out value="${user.login}" />
         </td>
     </tr>
</c: forEach> --%>



<table>
    <tr>
        <th>UserName</th>
        <th>EmailId</th>
        <th>UserId</th>
        <th>Password</th>
        <th>ConfirmPassword</th>
        <th>MobileNumber</th>
    </tr>
    <s:iterator value="RegisterDTO">
        <tr>
            <td><s:property value="username"/></td>
            <td><s:property value="email"/></td>
            <td><s:property value="userid"/></td>
            <td><s:property value="password"/></td>
      		<td><s:property value="password"/></td>
      		<td><s:property value="mobileno"/></td>
      
        </tr>
    </s:iterator>

</table>

</body>
</html>