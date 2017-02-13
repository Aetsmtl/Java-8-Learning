<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Create account</title>
</head>
	<body>
	<h1>ENTER ACCOUNT DETAILS PLEASE</h1>
		<form:form commandName="aNewAccount">
			<table>
				<tr><td>First Name <form:input path="firstName" type ="text" name="firstname"/></td></tr>
				<tr><td>Last Name <form:input path="lastName" type ="text" name="lastname"/></td></tr>
				<tr><td>Phone Number <form:input path="phoneNumber" type="text" name="phonenumber"/></td></tr>
				<tr><td><input type ="submit" value="Create ! "/></td></tr>
			</table>
		</form:form>
	</body>
</html>