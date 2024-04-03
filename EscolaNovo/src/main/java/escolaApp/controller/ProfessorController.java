package escolaApp.controller;

import escolaApp.model.domain.Professor;
import escolaApp.model.domain.service.ProfessorService;
import spark.Route;

public class ProfessorController {
	
	public static Route incluirProfessores = (req, res) -> {

		Professor professor = new Professor();

		ProfessorService.incluir(professor);

		return "Inclusao da professor foi realizada com sucesso";
	};

	public static Route excluirProfessor = (req, res) -> {

		Integer index = Integer.valueOf(req.params("id"));
		Professor professor = ProfessorService.obterProfessor(index);

		ProfessorService.excluir(index);

		return "Exclusão de professor" + professor + " foi realizada com sucesso";
	};

	public static Route listaProfessor = (req, res) -> {

		Integer index = Integer.valueOf(req.params("id"));
		Professor professor = ProfessorService.obterProfessor(index);

		return ProfessorService.obterProfessor(index);
	};

	public static Route listarProfessores = (req, res) -> {

		return ProfessorService.obterProfessors();

	};

}

