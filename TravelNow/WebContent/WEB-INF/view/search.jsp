<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search page</title>
</head>
<body>
<h3 align="right"><a href="/TravelNow">Back</a></h3>
<table align="center" border="5px">
	
		<tr>
			<td>City:</td>
			<td>${PlaceM.city}</td>
		</tr>
		<tr>
			<td>Description</td>
			<td>${PlaceM.description}</td>
		</tr>
</table>
<form:form
		method="post">
		<table align="center">
			<tr>
				<td><input type="submit" value="Mark Interested" onclick="doSubmit()"></td>
			</tr>
		</table>

	</form:form>

</body>
</html>

<script>
function doSubmit(){
var actionURL ="/TravelNow/placeInterested";
// perform your operations

myForm.submit(actionURL);
}

</script>
