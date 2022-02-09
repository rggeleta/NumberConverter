<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Number Converter</title>
</head>
<body>
	<h1>Number Converter</h1>
	<form action="getNumsServlet" method="post">
		<table border="1">
			<tbody>
				<tr>
					<td>Enter the first number:</td>
					<td><input type="text" name="num1" id="num1"></td>
				</tr>
				<tr>
					<td>Enter the second number:</td>
					<td><input type="text" name="num2" id="num2"></td>
				</tr>
				<tr>
					<td>Enter the third number:</td>
					<td><input type="text" name="num3" id="num3"></td>
				</tr>
				<tr>


					<td colspan="1"><input type="submit" name="num1" size="3" value="Calculate Average" />
				
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>
