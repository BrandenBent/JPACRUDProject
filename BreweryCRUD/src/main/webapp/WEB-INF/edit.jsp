<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Make Changes</title>
</head>
<body>
	<h1>Please Enter New Information</h1>
	<div>
		<form:form action="updateBrewery.do" method="GET"
			modelAttribute="brew">
			<input type='hidden' name='id' value='${brew.id}'>
			<br>
			<form:label path="name">Name: </form:label>
			<form:input path="name" required="required" value='${brew.name }' />
			<form:errors path="name" />
			<br>
			<form:label path="address">Address: </form:label>
			<form:input name="address" type="text" path="address"
				required="required" />
			<form:errors path="address" />
			<br>
			<form:label path="province">State: </form:label>
			<form:input type="text" path="province" />
			<form:errors path="province" />
			<br>
			<form:label path="zipcode"> Zipcode: </form:label>
			<br>
			<form:input type="text" path="zipcode" />
			<form:errors path="zipcode" />

			<br>
			<input type="hidden" name="id" value="${brew.id}">
			<input type='submit' value="Change">
		</form:form>

		<form action="index.do">
			<input type="submit" value="Home" />
		</form>
	</div>

</body>
</html>