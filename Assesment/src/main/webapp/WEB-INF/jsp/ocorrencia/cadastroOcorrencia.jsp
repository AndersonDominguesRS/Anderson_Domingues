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
			<form action="/usuario/incluir" method="post">
				<input type="text" name="nome" value="Anderson Domingues"
					class="form-control form-control-lg"> <label
					class="form-label" for="form3Example3">Digite o nome do
					novo usuário </label> <input type="email" name="email"
					value="anderson@google" class="form-control form-control-lg">
				<label class="form-label" for="form3Example3">Digite o
					e-mail do novo usuário </label> <input type="email" name="emailConf"
					value="anderson@google" class="form-control form-control-lg">
				<label class="form-label" for="form3Example3">Confirme o
					e-mail do novo usuário </label> <input type="password" name="senha"
					value="123" id="form3Example4" class="form-control form-control-lg">
				<label class="form-label" for="form3Example4">Digite a senha
					inicial do novo usuário</label> <input type="password" name="senhaConf"
					value="123" id="form3Example4" class="form-control form-control-lg"><label
					class="form-label" for="form3Example4">Confirme a senha
					inicial do novo usuário </label>

				<div
					class="d-flex flex-row align-items-center justify-content-center justify-content-lg-start"
					style="text-align: center;">
					<p class="lead fw-normal mb-0 me-3">Selecione o tipo de
						cadastro desejado</p>
				</div>

				<div class="d-flex justify-content-between align-items-center">

					<div class="form-check mb-0">
						<fieldset class="form-group">
							<div class="row">
								<div class="col-sm-10">
									<div class="form-check">
										<input class="form-check-input" name="tipo" value="USUARIO"
											type="radio" id="gridRadios1" checked> <label
											class="form-check-label" for="gridRadios1"> Cadastrar
											como usuário </label>
									</div>
									<div class="form-check">
										<input class="form-check-input" name="tipo" value="TECNICO"
											type="radio" id="gridRadios2"> <label
											class="form-check-label" for="gridRadios2"> Cadastrar
											como técnico </label>
									</div>
								</div>
							</div>
						</fieldset>
					</div>
				</div>
				<div class="text-center text-lg-start mt-4 pt-2">
					<button type="submit" class="btn btn-success"
						style="padding-left: 2.5rem; padding-right: 2.5rem;">Cadastrar</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>