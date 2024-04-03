package escolaApp.controller;

import escolaApp.model.domain.Avaliacao;
import escolaApp.model.domain.service.AvaliacoesService;
import spark.Route;

public class AvaliacoesController {
	
	public static Route incluirAvaliacoes = (req, res) -> {

		Avaliacao dvaliacoes = new Avaliacao();

		AvaliacoesService.incluir(dvaliacoes);

		return "Inclusao da dvaliacoes foi realizada com sucesso";
	};

	public static Route excluirAvaliacao = (req, res) -> {

		Integer index = Integer.valueOf(req.params("id"));
		Avaliacao dvaliacoes = AvaliacoesService.obterAvaliacao(index);

		AvaliacoesService.excluir(index);

		return "Exclusão de dvaliacoes" + dvaliacoes + " foi realizada com sucesso";
	};

	public static Route listaAvaliacao = (req, res) -> {

		Integer index = Integer.valueOf(req.params("id"));
		Avaliacao dvaliacoes = AvaliacoesService.obterAvaliacao(index);

		return AvaliacoesService.obterAvaliacao(index);
	};

	public static Route listarAvaliacoes = (req, res) -> {

		return AvaliacoesService.obterAvaliacoes();

	};

}
