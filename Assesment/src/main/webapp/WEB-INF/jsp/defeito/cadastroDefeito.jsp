<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<meta name="viewport" content="width=device-width, initial-scale=1">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>

<link href="../css/style.css" rel="stylesheet">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"></c:import>

	<div class="main" style="padding-top: 70px">
		<div class="container w-75 p-3 main-center">
			<form action="/defeito/incluir" method="post">
				
				<select class="form-select" name="identificacaoCliente"
					aria-label="Default select example">
					<option value="CLIENTE 1" >CLIENTE 1</option>
					<option value="CLIENTE 2">CLIENTE 2</option>

				</select>
					
				 <label
					class="form-label" for="form3Example3">Selecione o nome do
					Cliente </label>
				<select class="form-select" name="tipoEquipamento"
					aria-label="Default select example">
					<option value="TERMINAL DE ENTRADA" >TERMINAL DE ENTRADA</option>
					<option value="TERMINAL DE SAIDA">TERMINAL DE SAÍDA</option>
					<option value="ATM" selected>ATM</option>
					<option value="SERVIDOR" selected>SERVIDOR</option>
					<option value="MANAGER" selected>MANAGER</option>
					<option value="CAIXA" selected>CAIXA ASSISTIDO</option>
				</select>
				 <label class="form-label" for="form3Example3">Digite o tipo
					de equipamento </label>
					
				<select class="form-select" name="identificacaoEquipamento"
					aria-label="Default select example">
					<option value="EQUIPAMENTO 1" >EQUIPAMENTO 1</option>
					<option value="EQUIPAMENTO 2">EQUIPAMENTO 2</option>
				</select>

				<label class="form-label" for="form3Example3">Selecione a
					identificação do equipamento </label>
					
				<select class="form-select" name="observacoes"
					aria-label="Default select example">
					<option value="NAO LIGA" >NÃO LIGA</option>
					<option value="NAO CORTA PAPEL">NÃO CORTA PAPEL</option>
				</select>

					 <label
					class="form-label" for="form3Example4">Selecione a descrição
					do defeito</label>
				<div class="text-center text-lg-start mt-4 pt-2">
					<button type="submit" class="btn btn-success"
						style="padding-left: 2.5rem; padding-right: 2.5rem;">Cadastrar</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>