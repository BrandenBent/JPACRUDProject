<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add a new Brewery</</title>
</head>
<body>
	<div>
		<h1>
		
			Add a Brewery: <br/> <br/>
		</h1>
		<form:form action="createBrewery.do" method="post"
			modelAttribute="brewery">
			<ul>
				<li><label>Name</label> <input type="text" name="name" /></li>
				<li><label>Address</label> <input type="text" name="address" /></li>
				<li><label>State</label> <input type="text" name="province" /></li>
				<li><label>Zipcode</label> <input type="text" name="zipcode" />
				</li>
				<li><label>Website</label> <input type="text" name="website" />
				</li>
			</ul>

			<form:button type="submit"> Add </form:button>
		</form:form>
	</div>
</body>
</html>