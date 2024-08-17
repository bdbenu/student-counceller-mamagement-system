<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Counselor Register</title>
</head>
<body>

 <form:form modelAttribute="counselor" action="register" method="post">
<table>
<tr>
<td>Name:</td><td><form:input path="name" name="name" /></td>
</tr>

<tr>
<td>email:</td><td><form:input path="email" name="email" /></td>
</tr>

<tr>
<td>Password:</td><td><form:input path="password" name="password" /></td>
</tr>

<tr>
<td>Mobile:</td><td><form:input path="mobile" name="mobile" /></td>
</tr>

<tr>
<td><input type="submit" value="Register"></td><td><input type="reset" name="reset" value="Reset"/></td>
</tr>
</table>
</form:form>
</body>
</html>