package escolaApp.controller;

import escolaApp.model.domain.Disciplina;
import escolaApp.model.domain.service.DisciplinaService;
import spark.Route;

public class DisciplinaController {

	public static Route incluirDisciplinas = (req, res) -> {

		Disciplina disciplina = new Disciplina();

		DisciplinaService.incluir(disciplina);

		return "Inclusao da disciplina foi realizada com sucesso";
	};

	public static Route excluirDisciplinas = (req, res) -> {

		Integer index = Integer.valueOf(req.params("id"));
		Disciplina disciplina = DisciplinaService.obterDisciplina(index);

		DisciplinaService.excluir(index);

		return "Exclusão de disciplina" + disciplina + " foi realizada com sucesso";
	};

	public static Route listaDisciplina = (req, res) -> {

		Integer index = Integer.valueOf(req.params("id"));
		Disciplina disciplina = DisciplinaService.obterDisciplina(index);

		return DisciplinaService.obterDisciplina(index);
	};

	public static Route listarDisciplinas = (req, res) -> {

		return DisciplinaService.obterDisciplinas();

	};

}
