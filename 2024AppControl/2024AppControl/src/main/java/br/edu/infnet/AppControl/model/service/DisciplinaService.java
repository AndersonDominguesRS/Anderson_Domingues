package br.edu.infnet.AppControl.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.AppControl.model.domain.Disciplina;

@Service
public class DisciplinaService {
	
	private Map<String, Disciplina> disciplinas = new HashMap<String, Disciplina>();
	
	public void incluir(Disciplina disciplina) {
		System.out.println("A inclusão da disciplina " + disciplina + "foi realizada com sucesso");
		
		disciplinas.put(disciplina.getNome(), disciplina);
	}
	
	
	public void excluir(String  nome) {
		System.out.println("A exclusão da disciplina " + nome + "foi realizada com sucesso");
		
		disciplinas.remove(nome);
	}
	
	
	public Collection<Disciplina> obterLista() {
		
		return disciplinas.values();
	}
	
	
	public Disciplina obter(String nome) {
		
		return disciplinas.get(nome);
		
	}	
	

}
