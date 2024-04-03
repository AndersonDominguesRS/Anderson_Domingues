package escolaApp.controller;

import escolaApp.model.domain.ListaEspera;
import escolaApp.model.domain.service.ListaEsperaService;
import spark.Route;

public class ListaEsperaController {

	public static Route incluirListaEsperas = (req, res) -> {

		ListaEspera listaEspera = new ListaEspera();

		ListaEsperaService.incluir(listaEspera);

		return "Inclusao da listaEspera foi realizada com sucesso";
	};

	public static Route excluirListaEsperas = (req, res) -> {

		Integer index = Integer.valueOf(req.params("id"));
		ListaEspera listaEspera = ListaEsperaService.obterListaEspera(index);

		ListaEsperaService.excluir(index);

		return "Exclusão de listaEspera" + listaEspera + " foi realizada com sucesso";
	};

	public static Route listaListaEspera = (req, res) -> {

		Integer index = Integer.valueOf(req.params("id"));
		ListaEspera listaEspera = ListaEsperaService.obterListaEspera(index);

		return ListaEsperaService.obterListaEspera(index);
	};

	public static Route listarListaEsperas = (req, res) -> {

		return ListaEsperaService.obterListaEsperas();

	};

}
