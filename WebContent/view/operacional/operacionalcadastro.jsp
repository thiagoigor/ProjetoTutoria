<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />

<link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/resources\css\estilo.css">

<title>Cadastro de Operador</title>
</head>
<body>
	<%@ include file="../../fragment/topofragment.html" %>
	<%@ include file="../../fragment/menu.html" %>
	<div class="conteudo">
		<form action="" method="post">
  			<fieldset>
			    <legend>Informa��es:</legend>
			    Nome: <input type="text"><br>
			    Matr�cula: <input type="text"><br>
			    E-mail: <input type="text"><br>
			    Telefones: <input type="text"><br>
			    Tipo: <select>
				  <option value="Tipo1">Tipo1</option>
				  <option value="Tipo2">Tipo2</option>
				  <option value="Tipo3">Tipo3</option>
				  <option value="Tipo4">Tipo4</option>
				</select>
				<br/>
			    Sub-Tipo: <select>
				  <option value="Tipo1">Tipo1</option>
				  <option value="Tipo2">Tipo2</option>
				  <option value="Tipo3">Tipo3</option>
				  <option value="Tipo4">Tipo4</option>
				</select>
			    
		  	</fieldset>
		  	
		  	<input type="submit" name="salvar" value="Salvar" />
		  	<input type="submit" name="cancelar" value="Cancelar" />
		</form>
	</div>
	<%@ include file="../../fragment/rodape.html" %>
</body>
</html>