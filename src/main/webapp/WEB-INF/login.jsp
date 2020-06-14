<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>

<form:form  action="login" method="post" modelAttribute = "login">

Enter the Username: <form:input type="text" id="uname" name="uname" /> <br><br>

Enter the Password: <form:input type="password" id="password" name="password" /> <br><br>

<input type="submit" value="Login">

</form:form>

</body>
</html>