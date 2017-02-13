<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<style type="text/css">
		.error{
			color: red;
			font-size: 15px;
		}
	</style>
	<title>Create account</title>
</head>
	<body>
	<h1>ENTER ACCOUNT DETAILS PLEASE</h1>
		<form:form commandName="aNewAccount" method="post" action="getAccountCreated.html">
			<table>
				<tr><td>First Name <form:input path="firstName" type ="text" name="firstname"/>
				<form:errors path="firstName" cssClass="error" /></td></tr>
				
				
				<tr><td>Last Name <form:input path="lastName" type ="text" name="lastname"/>
				<form:errors path="lastName" cssClass="error" /></td></tr>
				
				
				<tr><td>Phone Number <form:input path="phoneNumber" type="text" name="phonenumber"/>
				<form:errors path="phoneNumber" cssClass="error" /></td></tr>
				
				
				<tr><td>E-mail <form:input path="email" type="text" name="e-mail"/>
				<form:errors path="email" cssClass="error" /></td></tr>
				
				
				<tr><td><input type ="submit" value="Create ! "/></td></tr>
			</table>
		</form:form>
	</body>
</html>