<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Administration</title>
</head>
<body>
	<c:url value="/j_spring_security_check" var="security_check_action" />
	<c:if test="${error}">
		<font color="red">Wrong username or password!</font>
		<br />
		<br />
	</c:if>
	<form action="${security_check_action}" method="post">
		Username: <input type="text" name="username"><br>
		Password: <input type="password" name="password"><br> <input
			type="reset" value="Reset"> <input type="submit"
			value="Login">
	</form>
</body>
</html>