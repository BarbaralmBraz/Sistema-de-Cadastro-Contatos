<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro</title>

</head>
<body>

<div> 
		<form action="cadastro" method="POST">
		
			Nome: <input type="text" name="nome" id="nome"><br><br>
			E-mail: <input type="text" name="email" id="email"><br><br>
			Telefone: <input type="text" name="telefone" id="telefone"><br><br>
			Endereço: <input type="text" name="endereco" id="endereco"><br><br>
			Senha <input type="password" name="senha" id="senha"><br><br>
			<input type="submit" value="Cadastrar"><br><br>
			 	
		</form>
	</div>

</body>
</html>