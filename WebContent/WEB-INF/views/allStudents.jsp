<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Students</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Nombre</th>
				<th>Segundo nombre</th>
				<th>Nacimiento</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${not empty studentsList}">
				<c:forEach var="student" items="${studentsList}" >
					<tr>
						<td>${student.name}</td>
						<td>${student.lasName}</td>
						<td>${student.dDate}</td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
	<c:out value="Using JSTL" />
</body>
</html>