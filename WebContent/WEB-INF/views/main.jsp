<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<title>Inventario</title>
</head>
<body>
	<div class='d-flex justify-content-center align-items-center flex-column'>
		<h3>Inventario:</h3>
		<form:form action="${pageContext.request.contextPath}/validar" modelAttribute="producto" method="POST">
			<div class='form-group'>
				<label>Nombre</label>
				<form:input cssClass='form-control' type='text' placeholder='Nombre' path="nombre"/>
				<br>
				<form:errors path="nombre" cssStyle="color:#ff0000" />
			</div>
			<div class='form-group'>
				<label>Marca</label>
				<form:input cssClass="form-control" type="text" placeholder="Marca" path="marca"/>
				<br>
				<form:errors path="marca" cssStyle="color:#ff0000;" />
			</div>
			<div class='form-group'>
				<label>Descripcion</label>
				<form:textarea cssClass="form-control" row="15" path="descripcion"/>
				<br>
				<form:errors path="descripcion" cssStyle="color:#ff0000;" />
			</div>
			<div class='form-group'>
				<label>Categoria</label>
				<form:select cssClass="form-control" path="categoria">
					<form:option value="Granos Basicos">Granos basicos</form:option>
					<form:option value="Entretenimiento">Entretenimiento</form:option>
					<form:option value="Entretenimiento">Tecnologia</form:option>
				</form:select>
				<br>
				<form:errors path="categoria" cssStyle="color:#ff0000" />
				
			</div>
			<div class='form-group'>
				<label>Precio</label>
				<div class="input-group mb-3">
				  <div class="input-group-prepend">
				    <span class="input-group-text" id="basic-addon1">$</span>
				  </div>
				  <form:input type="text" cssClass="form-control" placeholder="Precio" aria-label="Username" aria-describedby="basic-addon1" path="precio" />
				</div>
				<form:errors path="precio" cssStyle="color:#ff0000" />
			</div>
			<div class='form-group'>
				<label>Fecha de vencimiento</label>
				<form:input cssClass="form-control" type='date' path="fechaVencimiento"/>
			</div>
			<div cssClass="form-group">
				<button class="btn btn-info">Validar</button>
			</div>
		</form:form>
	</div>
</body>
</html>