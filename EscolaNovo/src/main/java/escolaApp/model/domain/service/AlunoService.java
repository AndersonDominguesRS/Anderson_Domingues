package escolaApp.model.domain.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import escolaApp.model.domain.Aluno;

public class AlunoService {
	
	private static Map<Integer, Aluno> alunos = new HashMap<Integer, Aluno>();
	
	private static Integer id=0;
	

	public static void incluir(Aluno alunoNovo) {
	
		alunoNovo.setId(++id);
		alunos.put(alunoNovo.getId(), alunoNovo);		
	}		

	public static void excluir(Integer idAluno) {
		
		alunos.remove(idAluno);
	}	

	public static Collection<Aluno> obterAlunos() {
		return alunos.values();		
	}		
	
	public static Aluno  obterAluno(Integer idAluno) {
		
		return alunos.get(idAluno);
		
	}

}
