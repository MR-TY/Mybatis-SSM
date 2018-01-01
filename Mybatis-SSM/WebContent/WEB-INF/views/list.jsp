<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="4" cellpadding="0">
			<tr>
				<th>id</th>
				<th>lastName</th>
				<th>email</th>
				<th>gender</th>
			</tr>
			<c:forEach items="${employee}" var="emp"> 
				<tr>
					<td>${emp.id }</td>
					<td>${emp.last_name }</td>
					<td>${emp.email }</td>
					<td>${emp.gender }</td>
				</tr>
			</c:forEach>
	</table>

</body>
</html>