<%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<script type="text/javascript"> window.onload = mensagemErro; </script>
<meta charset="ISO-8859-1">
<title>Lista de Contatos</title>
<script type="text/javascript">
	function mensagemErro(){
		var status = '<%=session.getAttribute("status")%>';
		var erro ="erro";
		if(status == erro){
		alert("E-mail ou telefone já cadastrado!");
	}
	}
</script>


</head>
<body>
	<fieldset> 
		<c:forEach items="${contatos}" var="contato">
 			<c:out value="${contato.nome}"></c:out><br/>
 			<c:out value="${contato.email}"></c:out><br/>
 			<c:out value="${contato.telefone}"></c:out><br/>
 			<c:out value="${contato.endereco}"></c:out><br/><br/><br/>
 			
  		</c:forEach>
 	</fieldset>
 	
  <a href="criarContato.jsp">Cadastro Contato</a><br/><br/>
  <a href="login.jsp">Sair</a>
</body>
</html>