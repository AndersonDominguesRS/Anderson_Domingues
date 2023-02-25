<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

<title>CONTROLE DE ATENDIMENTOS</title>
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
				<div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
					<form action="/login" method="post">
						<div
							class="d-flex flex-row align-items-center justify-content-center justify-content-lg-start">
							<p class="lead fw-normal mb-0 me-3">Nos siga nas redes
								sociais</p>
							<button type="button" class="btn btn-primary btn-floating mx-1">
								<i class="fab fa-facebook-f"></i>
							</button>

							<button type="button" class="btn btn-primary btn-floating mx-1">
								<i class="fab fa-twitter"></i>
							</button>

							<button type="button" class="btn btn-primary btn-floating mx-1">
								<i class="fab fa-linkedin-in"></i>
							</button>
						</div>

						<div class="divider d-flex align-items-center my-4">
							<p class="text-center fw-bold mx-3 mb-0">Ou</p>
						</div>

						<div class="form-outline mb-4">
							<input type="email" name="email" value="anderson@gmail "
								id="form3Example3" class="form-control form-control-lg" /> <label
								class="form-label" for="form3Example3">Digite o e-mail
								cadastrado </label>
						</div>

						<div class="form-outline mb-3">
							<input type="password" id="form3Example4" name="senha"
								value="anderson@gmail" class="form-control form-control-lg" /> <label
								class="form-label" for="form3Example4">Digite sua senha
							</label>
						</div>

						<div class="d-flex justify-content-between align-items-center">

							<div class="form-check mb-0">
								<input class="form-check-input me-2" type="checkbox" value=""
									id="form2Example3" /> <label class="form-check-label"
									for="form2Example3"> Lembrar dados de acesso </label>
							</div>
							<a href="#!" class="text-body">Esqueceu a senha?</a>
						</div>

						<div class="text-center text-lg-start mt-4 pt-2">
							<button type="submit" class="btn btn-primary btn-lg"
								style="padding-left: 2.5rem; padding-right: 2.5rem;">Login</button>
							<p class="small fw-bold mt-2 pt-1 mb-0">
								Não possui uma conta? <a href="/usuario" class="link-danger">Criar
									conta</a>
							</p>
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

	<script>
		function retornoTeste() {
			alert("Usuário não encontrado. Selecione a opção criar conta.");
		}
	</script>


</body>
</html>