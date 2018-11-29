<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
<h3 align="right"><a href="/TravelNow">Back</a></h3>
	<h2 align="center">${headerMessage}</h2>
	<h3 align="center">You are registered with following Info::::</h3>
	<table align="center" border="5px">
	
			<tr>
			<td>User email:</td>
			<td>${UserM.email}</td>
		</tr>
	
		<tr>
			<td>User Name:</td>
			<td>${UserM.userName}</td>
		</tr>
		
		<tr>
			<td>Student Phone:</td>
			<td>${UserM.phone}</td>
		</tr>

		<tr>
			<td>User Gender</td>
			<td>${UserM.gender}</td>
		</tr>

		
		<tr>
			<td>City</td>
			<td>${UserM.city}</td>
		</tr>
	
	</table>
	
	<form:form action="/TravelNow/placeSearch"
		method="post" modelAttribute="PlaceM">
		<table align="center">
			
			<tr>
				<td> Search Place: <input type="text" name="PlaceM"><br></td>
			</tr>
			<tr>
				<td><input type="submit" value="search"></td>
			</tr>
		</table>

	</form:form>
	
	
</body>
</html>