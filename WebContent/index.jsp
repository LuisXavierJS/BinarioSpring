<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Conversor</title>
</head>
<body>
	<h1>Conversor</h1>
	<p>Selecione o tipo de conversão que deseja fazer: </p>
	<form method="post" action="/BinarioSpring/cadastro/">
	<select name="valor" required>
		<option disabled select>Selecione</option>
		<option value="Binario">Binario para Decimal</option>
		<option value="Decimal">Decimal para Binário</option>
	</select><br>
	<input type="submit">
	</form>
</body>
</html>