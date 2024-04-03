package escolaApp.controller;

import escolaApp.model.domain.Aluno;
import escolaApp.model.domain.service.AlunoService;
import spark.Route;

public class AlunoController {

	public static Route listarAlunos = (req, res) -> {	
		
		
		Aluno aluno1= new Aluno();
		AlunoService.incluir(aluno1);	
		
		return AlunoService.obterAlunos();
	};
	
	public static Route incluirAlunos = (req, res) -> {
		
		Aluno aluno1= new Aluno();
		AlunoService.incluir(aluno1);
		
		return "Inclusao do aluno "+ aluno1 + " realizada com sucesso";
	};
	
	public static Route excluirAlunos = (req, res) -> {
		
		Integer index= Integer.valueOf(req.params("id"));		
		Aluno aluno= AlunoService.obterAluno(index);
		
		AlunoService.excluir(index);
		
		return "Exclusão de aluno" + aluno + " foi realizada com sucesso";
	};
	
	public static Route listaAluno = (req, res) -> {
		
		Integer index= Integer.valueOf(req.params("id"));		
		Aluno aluno= AlunoService.obterAluno(index);
		
		return AlunoService.obterAluno(index);
	};
	
}
