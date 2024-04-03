package escolaApp;

import escolaApp.controller.AlunoController;
import escolaApp.controller.AvaliacoesController;
import escolaApp.controller.DisciplinaController;
import escolaApp.controller.ListaEsperaController;
import escolaApp.controller.ProfessorController;
import escolaApp.controller.TurmaController;
import spark.Spark;

public class App {

	public static void main(String[] args) {

		Spark.port(8090);

		Spark.get("/", (req, res) -> {
			return App.class.getResourceAsStream("/index.html");
		}

		);

		// Aluno
		Spark.get("/aluno/listaGeral", AlunoController.listarAlunos);
		Spark.post("/aluno/incluir", AlunoController.incluirAlunos);
		Spark.delete("/aluno/:id/excluir", AlunoController.excluirAlunos);
		Spark.get("/aluno/:id/listaPorId", AlunoController.listaAluno);		
		

		// Avaliações
		Spark.get("/avaliacao/listaGeral", AvaliacoesController.listarAvaliacoes);
		Spark.post("/avaliacao/incluir", AvaliacoesController.incluirAvaliacoes);
		Spark.delete("/avaliacao/:id/excluir", AvaliacoesController.excluirAvaliacao);
		Spark.get("/avaliacao/:id/listaPorId", AvaliacoesController.listaAvaliacao);	
		

		// Disciplina
		Spark.get("/disciplina/listaGeral", DisciplinaController.listarDisciplinas);
		Spark.post("/disciplina/incluir", DisciplinaController.incluirDisciplinas);
		Spark.delete("/disciplina/:id/excluir", DisciplinaController.excluirDisciplinas);
		Spark.get("/disciplina/:id/listaPorId", DisciplinaController.listaDisciplina);
		

		// Lista de espera
		Spark.get("/listaEspera/listaGeral", ListaEsperaController.listarListaEsperas);
		Spark.post("/listaEspera/incluir", ListaEsperaController.incluirListaEsperas);
		Spark.delete("/listaEspera/:id/excluir", ListaEsperaController.excluirListaEsperas);
		Spark.get("/listaEspera/:id/listaPorId", ListaEsperaController.listaListaEspera);		
		

		// Professor
		Spark.get("/professor/listaGeral", ProfessorController.listarProfessores);
		Spark.post("/professor/incluir", ProfessorController.incluirProfessores);
		Spark.delete("/professor/:id/excluir", ProfessorController.excluirProfessor);
		Spark.get("/professor/:id/listaPorId", ProfessorController.listaProfessor);	

		// Turma
		Spark.get("/turma/listaGeral", TurmaController.listarTurmas);
		Spark.post("/turma/incluir", TurmaController.incluirTurmas);
		Spark.delete("/turma/:id/excluir", TurmaController.excluirTurmas);
		Spark.get("/turma/:id/listaPorId", TurmaController.listaTurma);

	}

}
