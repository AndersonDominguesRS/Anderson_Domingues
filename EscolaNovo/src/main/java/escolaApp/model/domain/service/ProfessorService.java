package escolaApp.model.domain.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import escolaApp.model.domain.Professor;

public class ProfessorService {
	
	private static Map<Integer, Professor> professors = new HashMap<Integer, Professor>();
	
	private static Integer id=0;
	

	public static void incluir(Professor professorNovo) {
	
		professorNovo.setId(++id);
		professors.put(professorNovo.getId(), professorNovo);		
	}		

	public static void excluir(Integer idProfessor) {
		
		professors.remove(idProfessor);
	}	

	public static Collection<Professor> obterProfessors() {
		return professors.values();		
	}		
	
	public static Professor  obterProfessor(Integer idProfessor) {
		
		return professors.get(idProfessor);
		
	}

}
