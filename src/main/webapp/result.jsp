<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>
	<p>
		${numberPouch.getUserNum1()} First number <br />
		${numberPouch.getUserNum2()} Second number <br />
		${numberPouch.getUserNum3()} Third number <br />

	</p>
	<a href="index.jsp">Select another number</a>
</body>
</html>