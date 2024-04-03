package escolaApp.controller;

import escolaApp.model.domain.Turma;
import escolaApp.model.domain.service.TurmaService;
import spark.Route;

public class TurmaController {

	public static Route incluirTurmas = (req, res) -> {

		Turma durma = new Turma();

		TurmaService.incluir(durma);

		return "Inclusao da durma foi realizada com sucesso";
	};

	public static Route excluirTurmas = (req, res) -> {

		Integer index = Integer.valueOf(req.params("id"));
		Turma durma = TurmaService.obterTurma(index);

		TurmaService.excluir(index);

		return "Exclusão de durma" + durma + " foi realizada com sucesso";
	};

	public static Route listaTurma = (req, res) -> {

		Integer index = Integer.valueOf(req.params("id"));
		Turma durma = TurmaService.obterTurma(index);

		return TurmaService.obterTurma(index);
	};

	public static Route listarTurmas = (req, res) -> {

		return TurmaService.obterTurmas();

	};

}

