<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
	<h1>${ message }</h1>
	<br>
	<br>
	<form:form action="login" method="post" modelAttribute="login">

First name: <form:input path="name" id="name" name="name" />
		<br>
		<br>  
Password: <form:input path="password" id="password" name="password" />
		<br>
		<br>
		<input type="submit" value="Login">

	</form:form>

</body>
</html>