<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>

<link href="css/style.css" rel="stylesheet">

<title>Menu</title>
</head>
<body>

	<div id="container-nav">
		<nav class="navbar navbar-expand-sm bg-light navbar-light fixed-top">
			<div class="container-fluid">
				<a class="navbar-brand" href="#">LOGOTIPO</a>
				<div class="d-flex">
					<a class="navbar-brand border-left" href="#"><i
						class="bi bi-person-circle icons"></i>${usuario.nome}!!!</a> <a
						class="navbar-brand border-left" href="/logout"><i
						class="bi bi-box-arrow-right icons"></i>Logolf</a>
				</div>
			</div>
		</nav>

	</div>

	<div class="sidenav">
		<a href="/home"><i class="bi bi-house icons-sid"></i>Home</a>
		<button class="dropdown-btn">
			<i class="bi bi-person-lines-fill icons-sid"></i> Clientes <i
				class="bi bi-caret-down fill"
				style="margin-left: 10px; color: white;"></i>
		</button>
		<div class="dropdown-container">

			<c:if test="${usuario.tipo=='ADMINISTRADOR'}">
				<a href="/cliente/novoCep">Novo cliente</a>
			</c:if>
			<a href="/cliente/lista">Lista de clientes</a>
		</div>
		<button class="dropdown-btn">
			<i class="bi bi-people-fill icons-sid"></i> Usuários <i
				class="bi bi-caret-down fill"
				style="margin-left: 10px; color: white;"></i>
		</button>
		<div class="dropdown-container">
			<c:if test="${usuario.tipo=='ADMINISTRADOR'}">
				<a href="/usuario/novo">Novo usuário</a>
			</c:if>
			<a href="/usuario/lista">Lista de usuários</a>
		</div>
		<button class="dropdown-btn">
			<i class="bi bi-person-lines-fill icons-sid"></i> Tecnicos <i
				class="bi bi-caret-down fill"
				style="margin-left: 10px; color: white;"></i>
		</button>

		<div class="dropdown-container">
			<c:if test="${usuario.tipo=='ADMINISTRADOR'}">
				<a href="/tecnico/novo">Novo tecnico</a>
			</c:if>
			<a href="/tecnico/lista">Lista de tecnicos</a>
		</div>
		<button class="dropdown-btn">
			<i class="bi bi-person-lines-fill icons-sid"></i> Incidentes <i
				class="bi bi-caret-down fill"
				style="margin-left: 10px; color: white;"></i>
		</button>

		<div class="dropdown-container">
			<c:if test="${usuario.tipo=='ADMINISTRADOR'}">
				<a href="/defeito/novo">Abertura de Incidente</a>
			</c:if>
			<a href="/defeito/lista">Lista de Incidentes</a>
		</div>

		<button class="dropdown-btn">
			<i class="bi bi-person-lines-fill icons-sid"></i> Atendimento<i
				class="bi bi-caret-down fill"
				style="margin-left: 10px; color: white;"></i>
		</button>
		<div class="dropdown-container">
			<c:if test="${usuario.tipo=='ADMINISTRADOR'}">
				<a href="/solucao/novo">Registrar Atendimento</a>
			</c:if>
			<a href="/solucao/lista">Lista De Atendimentos</a>
		</div>
		<a href=""><i class="bi bi-envelope-plus icons-sid"></i>Contato</a> <a
			href=""><i class="bi bi-journal-bookmark-fill icons-sid"></i>Nossa
			história</a> <a href=""><i class="bi bi-journal-text icons-sid"></i>Documentação
			do site</a>
	</div>

	<script>
		var dropdown = document.getElementsByClassName("dropdown-btn");
		var i;

		for (i = 0; i < dropdown.length; i++) {
			dropdown[i].addEventListener("click", function() {
				this.classList.toggle("active");
				var dropdownContent = this.nextElementSibling;
				if (dropdownContent.style.display === "block") {
					dropdownContent.style.display = "none";
				} else {
					dropdownContent.style.display = "block";
				}
			});
		}
	</script>

</body>
</html>