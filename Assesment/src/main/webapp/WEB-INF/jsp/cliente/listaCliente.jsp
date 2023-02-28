<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<meta charset="utf-8">
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
		<c:if test="${not empty mensagem}">
			<div class="alert alert-success">
				<strong></strong> ${mensagem}
			</div>
		</c:if>

		<c:if test="${ empty clientes}">

			<h5 style="text-align: center; margin-top: 50px">
				<i class="bi bi-emoji-frown icons"></i>N�O EXISTEM CLIENTES
				CADASTRADOS!!!
			</h5>

		</c:if>

		<c:if test="${not empty clientes }">

			<h5>QUANTIDADE DE CLIENTES CADASTRADOS: ${clientes.size()}</h5>

			<table class="table table-condensed">
				<thead>
					<tr>
						<th>ID</th>
						<th>Nome Cliente</th>
						<th>CNPJ</th>
						<th>Endere�o</th>
						<th>Cidade</th>
						<th>Estado</th>
						<th>Pais</th>
						<th>Cep</th>
						<th>A��es</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="c" items="${clientes}">
						<tr>
							<td>${c.id}</td>
							<td>${c.nomeCliente}</td>
							<td>${c.cnpj}</td>
							<td>${c.endereco}</td>
							<td>${c.cidade}</td>
							<td>${c.estado}</td>
							<td>${c.pais}</td>
							<td>${c.cep}</td>
							<td><a href="/cliente/${c.id}/excluir"> EXCLUIR </a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
	</div>
</body>
</html>