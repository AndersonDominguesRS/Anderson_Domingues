package escolaApp.model.domain.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import escolaApp.model.domain.Disciplina;

public class DisciplinaService {
	
	private static Map<Integer, Disciplina> disciplinas = new HashMap<Integer, Disciplina>();
	
	private static Integer id=0;
	

	public static void incluir(Disciplina disciplinaNovo) {
	
		disciplinaNovo.setId(++id);
		disciplinas.put(disciplinaNovo.getId(), disciplinaNovo);		
	}		

	public static void excluir(Integer idDisciplina) {
		
		disciplinas.remove(idDisciplina);
	}	

	public static Collection<Disciplina> obterDisciplinas() {
		return disciplinas.values();		
	}		
	
	public static Disciplina  obterDisciplina(Integer idDisciplina) {
		
		return disciplinas.get(idDisciplina);
		
	}

}
