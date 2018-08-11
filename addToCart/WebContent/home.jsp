<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<jsp:include page="header.jsp"></jsp:include>
	</div>
	<table>
		<tr>
			<th>Book ID</th>
			<th>Book Name</th>
			<th>Price</th>
			<th>Description</th>
		</tr>
		<tr>
			<jstl:forEach var="book" items="${sessionScope.book}">
				<tr>
					<td>${book.id}</td>
					<td>${book.name}</td>
					<td>${book.price}</td>
					<td>${book.description}</td>
					<td><a href="addToCart.shop?id=${book.id}">Add To Cart</a>
				</tr>
			</jstl:forEach>
		</tr>
	</table>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>