<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Breweries</title>
</head>
<body>
All Breweries in Database:
		<c:choose>
			<c:when test="${! empty allBreweries }">

				<c:forEach var="breweries" items="${allBreweries}">
				<p><strong><u>${ breweries.name}</u></strong></p>
				<p>${breweries.address }  ${breweries.province},  ${breweries.zipcode }</p>
						
						<form action="deleteBrewery.do" method="POST">
							<button type="submit">Delete</button>
                			<input type="hidden" name="id" value="${breweries.id }"/>
						</form>
						<form action="updateBrewery.do" method="GET">
                			<button type="submit">Update</button>
                			<input type="hidden" name="id" value="${breweries.id }"/>
               		 	</form>
               		 	<form action="index.do">
      						<input type = "submit" value = "Home" />
      					</form> 
				</c:forEach>
			</c:when>
			<c:otherwise>
				<h3>No Breweries found.</h3>
			</c:otherwise>
		</c:choose>

</body>
</html>