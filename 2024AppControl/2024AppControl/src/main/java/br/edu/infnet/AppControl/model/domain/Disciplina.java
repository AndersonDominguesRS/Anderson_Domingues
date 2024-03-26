package br.edu.infnet.AppControl.model.domain;

import java.util.List;

public class Disciplina {
	
	private String nome;
	private List<Aluno> alunos;
	
	
	public Disciplina(String nome) {
		this.setNome(nome);
		
	}
	
	public Disciplina(String nome, List<Aluno> alunos) {
		this.setNome(nome);
		this.setAlunos(alunos);
		
	}
	
	@Override
	public String toString() {
		
		return "Disclipna " + nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

}
