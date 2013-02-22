<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>:: Registro ::</title>
</head>
<body>
	<h1>Registro</h1><hr>
	
	<form action="ServletRegistro" method="post">
		<p><label for="matricula">Matrícula: </label><input type="text" name="matricula" id="matricula" value=""></p>
		<p><label for="nombre">Nombre: </label><input type="text" name="nombre" id="nombre" value=""></p>
		<p><label for="curso">Curso: </label><input type="text" name="curso" id="curso" value=""></p>
		<p><label for="direccion">Dirección: </label><input type="text" name="direccion" id="direccion" value=""></p>
		
		<input type="submit" value="Registrar">
		<input type="reset" value="Limpiar">
	</form>
</body>
</html>