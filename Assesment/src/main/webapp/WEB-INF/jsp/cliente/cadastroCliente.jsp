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



			<form action="/cliente/incluir" method="post">
				<input type="text" name="nome" value="SHOPPING ABC"
					class="form-control form-control-lg"> 
					<label
					class="form-label" for="form3Example3">Digite o nome do
					novo cliente
					 </label>
					 <input type="text" name="cnpj" value="51581165000135"
					class="form-control form-control-lg">
					 <label
					class="form-label" for="form3Example3">Digite o CNPJ do
					cliente
					 </label> 
					<input type="text" name="cep" value="${endereco.cep}"
					id="form3Example4" class="form-control form-control-lg">
					<label
					class="form-label" for="form3Example4">CEP informado
					 </label> 
					 
					 <input type="text" name="numero" value=""
					id="form3Example4" class="form-control form-control-lg">
					<label
					class="form-label" for="form3Example4">Digite o número do endereço 
					</label>
					 
					 <input type="text" name="logradouro" value="${endereco.logradouro }"
					class="form-control form-control-lg">
					 <label
					class="form-label" for="form3Example3">Rua
					</label>
					
					 <input type="text" name="bairro" value="${endereco.bairro }"
					id="form3Example4" class="form-control form-control-lg">
					 <label
					class="form-label" for="form3Example4">Bairro
					</label>
					
					 <input type="text" name="localidade" value="${endereco.localidade }"
					id="form3Example4" class="form-control form-control-lg">
					 <label
					class="form-label" for="form3Example4">Cidade
					</label>
					 <input type="text" name="uf" value="${endereco.uf }"
					id="form3Example4" class="form-control form-control-lg">
					<label
					class="form-label" for="form3Example4">Estado
					 </label>



				<div class="text-center text-lg-start mt-4 pt-2">
					<button type="submit" class="btn btn-success"
						style="padding-left: 2.5rem; padding-right: 2.5rem;">Cadastrar</button>
				</div>
			</form>

		</div>
	</div>
</body>
</html>