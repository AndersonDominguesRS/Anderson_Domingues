package escolaApp.model.domain.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import escolaApp.model.domain.Turma;

public class TurmaService {
	
	private static Map<Integer, Turma> turmas = new HashMap<Integer, Turma>();
	
	private static Integer id=0;
	

	public static void incluir(Turma turmaNovo) {
	
		turmaNovo.setId(++id);
		turmas.put(turmaNovo.getId(), turmaNovo);		
	}		

	public static void excluir(Integer idTurma) {
		
		turmas.remove(idTurma);
	}	

	public static Collection<Turma> obterTurmas() {
		return turmas.values();		
	}		
	
	public static Turma  obterTurma(Integer idTurma) {
		
		return turmas.get(idTurma);
		
	}

}