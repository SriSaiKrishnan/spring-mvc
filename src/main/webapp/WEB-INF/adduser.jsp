<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

<form action="adduser" method="post">

Enter the Username: <input type="text" id="uname" name="uname"> <br><br>

Enter the Password: <input type="password" id="password" name="password"> <br><br>

Select the Role: <select name="role" id="role">
  <option value="Admin">Admin</option>
  <option value="Employee">Employee</option>
  <option value="Board of Directors">Board of Directors</option>
</select> <br><br>

Select the Team:  <select name="team" id="team">
  <option value="learn">Learn</option>
  <option value="learnmobile">Learn Mobile</option>
  <option value="community">Community Engagement</option>
  <option value="bbss">Blackboard Student Service</option>
  <option value="devops">Devops</option>
  <option value="EQPT">EQPT</option>
</select> <br><br>

<input type="submit" value="Add User">

</form>


</body>
</html>