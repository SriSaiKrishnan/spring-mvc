<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>adduser</title>
</head>
<body>

<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	if(session.getAttribute("username")==null){
		response.sendRedirect("login.jsp");
	}
%>

<form:form action="adduser" method="post" modelAttribute="adduser">

Enter the Name: <form:input path="" type="text" id="uname" name="uname" /> <br><br>

Enter the Password: <form:input path="" type="password" id="password" name="password" /> <br><br>

Select the Role: <form:select path="role" name="role" id="role">
  <form:option value="Admin" label="Admin"/> 
  <form:option value="Employee" label="Employee" />
  <form:option value="Board of Directors" label="Board of Directors"/>
</form:select> <br><br>

Select the Team:  <form:select path="team" name="team" id="team">
  <form:option value="learn" label="learn" />
  <form:option value="learnmobile" label="learnmobile" />
  <form:option value="community" label="community" />
  <form:option value="bbss" label="bbss" />
  <form:option value="devops" label="devops" />
  <form:option value="EQPT" label="EQPT" />
</form:select> <br><br>

<input type="submit" value="Add User">

</form:form>


</body>
</html>