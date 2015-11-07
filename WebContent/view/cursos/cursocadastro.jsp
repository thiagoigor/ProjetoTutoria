<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link href="../../resources/bootstrap/css/bootstrap-theme.min.css"
	rel="stylesheet" />
<link href="../../resources/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources\css\estilo.css">

<title>Tela B�sica Bootstrap</title>
</head>
<body class="conteiner">
	<%@ include file="../../fragment/topofragment.html"%>

	<section>
	<div class="row">
		<%@ include file="../../fragment/menu.html"%>
		<div class="col-md-10">
			<article>
			
			<form class="form-horizontal form-search" name="formCoordenador"
				action="" method="post">
				<div class="cold-md-12">
					<fieldset class="fsStyle">
						<legend class="legendStyle"> Informa��es </legend>
						<div class="form-group">
							<label for="nome" class="col-sm-2 control-label">Nome</label>
							<div class="col-sm-10">
								<input class="form-control input-form" type="text" name="nome"><br>
							</div>
						</div>
						<div class="form-group">
							<label for="matricula" class="col-sm-2 control-label">Centro
								de Custo</label>
							<div class="col-sm-10">
								<input class="form-control input-form" type="text"
									nome="matricula"><br>
							</div>
						</div>
						<div class="form-group">
							<label for="email" class="col-sm-2 control-label">Periodos</label>
							<div class="col-sm-10">
								<input class="form-control input-form" type="text" name="email"><br>
							</div>
						</div>
						<div class="form-group">
							<label for="email" class="col-sm-2 control-label">Ciclo
								b�sico</label>
							<div class="col-sm-2">
								<input class="radio-inline" type="radio"
									name="inlineRadioOptions" id="inlineRadio1" value="S">
								Sim

							</div>
							<div class="col-sm-2">
								<input class="radio-inline" type="radio"
									name="inlineRadioOptions" id="inlineRadio1" value="N">
								N�o
							</div>
						</div>
						
						<div class="form-group">
							<label for="email" class="col-sm-2 control-label">Coordenador</label>
							<div class="col-sm-10">
								<select class="form-control combo-padrao" class="combo-padrao">
									<option>Coordenador 1</option>
									<option>Coordenador 2</option>
									<option>Coordenador 3</option>
									<option>Coordenador 4</option>
									<option>Coordenador 5</option>
								</select>
							</div>
						</div>
						
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-1">
								<button class="btn btn-default" type="submit" name="salvar">Salvar</button>
							</div>
							<div class="col-sm-1">
								<button class="btn btn-default" type="button" name="cancelar">Cancelar</button>
							</div>
						</div>
					</fieldset>
				</div>
			</form>

			</article>
		</div>
	</div>
	</section>
	<%@ include file="../../fragment/rodape.html"%>

	<script src="../../resources/jquery/jquery-2.1.4.min.js"></script>
	<script src="../../resources/bootstrap/js/bootstrap.min.js"></script>
	<script src="resources/js/script.js"></script>
</body>
</html>