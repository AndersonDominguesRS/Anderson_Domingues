package br.edu.infnet.AppControl.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppControl.model.domain.Aluno;

@Service
public class AlunoService {
	
		
	private static Map<String, Aluno> alunos = new HashMap<String, Aluno>();
	
	public void incluir(Aluno aluno) {
		System.out.println("A inclusão do aluno " + aluno + " foi realizada com sucesso");
		
		alunos.put(aluno.getNome(), aluno);
	}
	
	
	public void excluir(String  nome) {
		System.out.println("A exclusão do aluno " + nome + " foi realizada com sucesso");
		
		alunos.remove(nome);
	}
	
	
	public Collection<Aluno> obterLista() {
		
		return alunos.values();
	}
	
	
	public Aluno obter(String nome) {
		
		System.out.println("Passou novamente no service obter aluno com o nome " + nome);
		
		System.out.println("obtendo o nome da lista " + alunos.get("ANDERSON"));
		
		
		return alunos.get(nome);
		
	}	
	

}
