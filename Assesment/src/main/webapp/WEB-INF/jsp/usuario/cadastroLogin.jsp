<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<link href="css/style.css" rel="stylesheet">
<script src="https://kit.fontawesome.com/980527d6ac.js"
	crossorigin="anonymous"></script>

<title>Insert title here</title>
</head>
<body>

	<section class="vh-100">
		<div class="container-fluid h-custom">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col-md-9 col-lg-6 col-xl-5">
					<h1 style="text-align: center; font-family: serif;">GESTÃO DE
						ATENDIMENTO EFICIENTE</h1>
					<img
						src="https://st.depositphotos.com/17764632/56566/v/600/depositphotos_565665802-stock-illustration-business-concept-girls-planning-a.jpg"
						class="img-fluid" alt="Sample image">
				</div>
				<div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1 w-25 p-3"
					style="border: 3px solid; border-radius: 10px;">
					<form action="/usuario/incluirLogin" method="post">
						<input type="text" name="nome" value="Anderson Domingues"
							class="form-control form-control-lg"> <label
							class="form-label" for="form3Example3">Digite seu nome </label> <input
							type="email" name="email" value="anderson@google"
							class="form-control form-control-lg"> <label
							class="form-label" for="form3Example3">Digite seu e-mail
						</label> <input type="email" name="emailConf" value="anderson@google"
							class="form-control form-control-lg"> <label
							class="form-label" for="form3Example3">Confirme seu
							e-mail </label> <input type="password" name="senha" value="123"
							id="form3Example4" class="form-control form-control-lg">
						<label class="form-label" for="form3Example4">Digite sua
							senha</label> <input type="password" name="senhaConf" value="123"
							id="form3Example4" class="form-control form-control-lg"><label
							class="form-label" for="form3Example4">Confirme sua senha
						</label>

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
													class="form-check-label" for="gridRadios1">
													Cadastrar como usuário </label>
											</div>
											<div class="form-check">
												<input class="form-check-input" name="tipo" value="TECNICO"
													type="radio" id="gridRadios2"> <label
													class="form-check-label" for="gridRadios2">
													Cadastrar como técnico </label>
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
		</div>
		<div
			class="d-flex flex-column flex-md-row text-center text-md-start justify-content-between py-4 px-4 px-xl-5 bg-primary">

			<div class="text-white mb-3 mb-md-0">Copyright © 2023. All
				rights reserved.</div>
			<div>
				<a href="#!" class="text-white me-4"> <i
					class="fab fa-facebook-f"></i>
				</a> <a href="#!" class="text-white me-4"> <i class="fab fa-twitter"></i>
				</a> <a href="#!" class="text-white me-4"> <i class="fab fa-google"></i>
				</a> <a href="#!" class="text-white"> <i class="fab fa-linkedin-in"></i>
				</a>
			</div>
		</div>
	</section>

</body>
</html>