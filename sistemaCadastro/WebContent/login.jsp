<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="servlets.Login"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

</head>
<body>

	<div> 
		<form action="login" method="POST">
		
			LOGIN <input type="text" name="login" id="login"><br><br>
			SENHA <input type="password" name="senha" id="senha"><br><br>
			<input type="submit" value="Enviar"><br><br>
			
			 	
		</form>
		
		<a href="cadastro.jsp">Cadastrar</a>
	</div>
</body>
</html>