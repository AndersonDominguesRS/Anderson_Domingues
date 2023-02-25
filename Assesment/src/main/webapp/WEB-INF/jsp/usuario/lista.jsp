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

		<c:if test="${ empty usuarios}">

			<h5 style="text-align: center; margin-top: 50px">
				<i class="bi bi-emoji-frown icons"></i>NÃO EXISTEM USUARIOS
				CADASTRADOS!!!
			</h5>

		</c:if>

		<c:if test="${not empty usuarios }">

			<h5>QUANTIDADE DE USUÁRIOS CADASTRADOS: ${usuarios.size()}</h5>

			<table class="table table-condensed">
				<thead>
					<tr>
						<th>ID</th>
						<th>Nome</th>
						<th>Senha</th>
						<th>Email</th>
						<th>Tipo</th>
						<th>Ações</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="u" items="${usuarios}">
						<tr>
							<td>${u.id}</td>
							<td>${u.nome}</td>
							<td>${u.senha}</td>
							<td>${u.email}</td>
							<td>${u.tipo}</td>
							<td><a href="/usuario/${u.id}/excluir"> EXCLUIR </a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
	</div>
</body>
</html>