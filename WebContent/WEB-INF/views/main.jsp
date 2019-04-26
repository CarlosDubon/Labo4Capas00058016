<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/formData" method="post">
		<label>Nombre</label><input type="text" name="name" />
		<label>Apellido</label><input type="text" name="lname" />
		<label>Fecha nacimiento</label><input type="text" name="date" />
		<label>Carrera</label><input type="text" name="carrer" />
		<label>Experiencia</label><input type="text" name="experience" />
		<input type="submit" >
	</form>
</body>
</html>