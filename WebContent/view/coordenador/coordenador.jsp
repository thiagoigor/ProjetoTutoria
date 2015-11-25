<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="br.com.tutoronline.entity.Coordenador"%>
<%@page import="java.util.List"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link href="../../resources/bootstrap/css/bootstrap-theme.min.css"
	rel="stylesheet" />
<link href="../../resources/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" />
<link rel="stylesheet" type="text/css"
	href="<%= request.getContextPath()%>/resources/css/estilo.css">

<title>Coordenador</title>
</head>
<body class="conteiner">
	<%@ include file="../../fragment/topofragment.html"%>

	<section>
	<div class="row">
		<%@ include file="../../fragment/menu.html"%>
		<div class="col-md-10">
			<article>
				<% String retorno = (String) request.getAttribute("retorno"); if(retorno != null) out.println(retorno); %>
				<h3>Lista de Coordenadores</h3>
			<br />

			<table class="table table-hover">
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
				<% 
					List<Coordenador> coordenadores = (List) request.getAttribute("usuarios");
				if(coordenadores != null){
					for(Coordenador c : coordenadores){
				%>
					<tr>
						<td><%=c.getNome() %></td>
						<td><%=c.getMatricula()%></td>
						<td><%=c.getEmail()%></td>
						<td><%=c.getTelefone() %></td>
						<td><a href="user?action=remover&id=<%=c.getId()%>" method="post" ><img alt="" title="" src="/img/delete.png"  /></a></td>
					</tr> 
					<%
					}}
				%>
				</tbody>
			</table>
			<a
				href="<%= request.getContextPath()%>/view/coordenador/coordenadorcadastro.jsp"><button class="btn btn-default">Novo
					Coordenador</button></a>
			</article>
		</div>
	</div>
	</section>
	<%@ include file="../../fragment/rodape.html"%>

	<script src="../../resources/jquery/jquery-2.1.4.min.js"></script>
	<script src="../../resources/bootstrap/js/bootstrap.min.js"></script>
	<script src="../../resources/script/script.js"></script>
</body>
</html>