<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />

<link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/resources\css\estilo.css">

<title>Coordenadores</title>
</head>
<body>
	<%@ include file="../../fragment/topofragment.html" %>
	<%@ include file="../../fragment/menu.html" %>
	<div class="conteudo">
		<h3>Lista de Coordenadores</h3> <br/>
		
		<table border="1px">
			<thead>
				<tr>
					<th>Nome</th>
					<th>Matrícula</th>
					<th>E-mail</th>
					<th>Telefone</th>
					<th>Operações</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Juliano</td>
					<td>2233</td>
					<td>Juliano@alfa.br</td>
					<td>62 99999999</td>
					<td>A R</td>
				</tr>
			</tbody>
		</table>
		<a href="<%= request.getContextPath()%>/view/coordenador/coordenadorcadastro.jsp"><button>Novo Coordenador</button></a>
		
	</div>
	<%@ include file="../../fragment/rodape.html" %>
</body>
</html>