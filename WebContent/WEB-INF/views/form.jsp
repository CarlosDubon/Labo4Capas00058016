<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Nombre</th>
				<th>Apellido</th>
				<th>Fecha de nacimiento</th>
				<th>Carrera</th>
				<th>Experiencia</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${student.name}</td>
				<td>${student.lasName}</td>
				<td>${student.dDate}</td>
				<td>${student.carrer}</td>
				<td>${student.exprerience}</td>
			</tr>
		</tbody>
		
	</table>
</body>
</html>