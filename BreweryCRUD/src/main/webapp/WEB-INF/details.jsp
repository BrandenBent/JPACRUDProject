<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	Brewery By ID:
		<c:choose>
			<c:when test="${! empty brew }">

				<p><strong><u>${ brew.name}</u></strong></p>
				<p>${brew.address }  ${brew.province},  ${brew.zipcode }</p>
						
						<form action="deleteBrewery.do" method="post">
							<button class ="btn btn-secondary" type="submit">Delete</button>
                			<input type="hidden" name="id" value="${breweries.id }"/>
						</form>
						<form action="update.do" method="get">
                			<button class ="btn btn-secondary" type="submit">Update</button>
                			<input type="hidden" name="id" value="${breweries.id }"/>
               		 	</form>
               		 	<form action="index.do">
      						<input type = "submit" value = "Home" />
      					</form> 
			</c:when>
			<c:otherwise>
				<h3>No Breweries found.</h3>
			</c:otherwise>
		</c:choose>
	

</body>
</html>