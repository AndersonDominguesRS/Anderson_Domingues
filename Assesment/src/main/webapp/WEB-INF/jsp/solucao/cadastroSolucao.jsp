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
		<div class="container w-90 p-3 main-center">
			<form class="was-validated row g-3" action="/solucao/incluir"
				method="post">

				<div class="col-md-6">
					<select class="form-select" required aria-label="select example"
						name="identificacaoCliente">

						<option selected disabled value="">Empreendimento...</option>
						<option value="CLIENTE 1">CLIENTE 1</option>
						<option value="CLIENTE 2">CLIENTE 2</option>

					</select>

					<div class="invalid-feedback">Necessário selecionar um
						empreendimento</div>

					<div class="valid-feedback">Identificação do empreendimento</div>

				</div>

				<div class="col-md-6">
					<select class="form-select" required aria-label="select example"
						name="tipoEquipamento">

						<option selected disabled value="">Tipo equipamento...</option>
						<option value="TERMINAL DE SAIDA">TERMINAL DE SAÍDA</option>
						<option value="ATM">ATM</option>
						<option value="SERVIDOR">SERVIDOR</option>
						<option value="MANAGER">MANAGER</option>
						<option value="CAIXA">CAIXA</option>


					</select>

					<div class="invalid-feedback">Necessário selecionar um tipo
						de equipamento</div>

					<div class="valid-feedback">Tipo de equipamento</div>

				</div>

				<div class="col-md-6">
					<select class="form-select" required aria-label="select example"
						name="identificacaoEquipamento">

						<option selected disabled value="">Identificação do
							equipamento...</option>
						<option value="EQUIPAMENTO 1">EQUIPAMENTO 1</option>
						<option value="EQUIPAMENTO 2">EQUIPAMENTO 2</option>

					</select>

					<div class="invalid-feedback">Necessário selecionar a
						identificação do equipamento</div>

					<div class="valid-feedback">Identificação do equipamento</div>

				</div>

				<div class="col-md-6">
					<select class="form-select" required aria-label="select example"
						name="observacoes">

						<option selected disabled value="">Defeito...</option>
						<option value="NAO LIGA">NAO LIGA</option>
						<option value="NAO CORTA PAPEL">NAO CORTA PAPEL</option>

					</select>

					<div class="invalid-feedback">Necessário selecionar um tipo
						de defeito</div>

					<div class="valid-feedback">Defeito informado</div>

				</div>

				<div class="col-md-6">

					<input type="datetime-local" name="data" class="form-control"
						required aria-label="select example">
					<div class="invalid-feedback">Informe data e hora abertura
						chamado</div>

					<div class="valid-feedback">Data abertura chamado</div>

				</div>

				<div class="col-md-6">

					<input type="datetime-local" name="horaRecebimento"
						class="form-control" required aria-label="select example">
					<div class="invalid-feedback">Informe data e hora recebimento
						chamado</div>

					<div class="valid-feedback">Data recebimento chamado</div>

				</div>

				<div class="col-md-6">

					<input type="datetime-local" name="horaInicioAtendimento"
						class="form-control" required aria-label="select example">
					<div class="invalid-feedback">Informe data e hora inicio
						atendimento</div>

					<div class="valid-feedback">Data inicio atendimento</div>

				</div>

				<div class="col-md-6">

					<input type="datetime-local" name="horaFimAtendimento"
						class="form-control" required aria-label="select example">
					<div class="invalid-feedback">Informe data e hora término
						atendimento</div>

					<div class="valid-feedback">Data término atendimento</div>

				</div>

				<div class="mb-3" style="text-align: center;">
					<button class="btn btn-lg btn-primary" type="submit">Finalizar</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>