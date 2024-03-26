package br.edu.infnet.AppControl.model.domain;

public class Aluno {
	
	private int id;
	private String nome;
	private String tipo;
	private int frequencia;
	private float nota;
	private boolean aprovado;
	private Endereco endereco;
	
	public Aluno() {
		
	}

	public Aluno(int id, String nome, String tipo, int frequencia, float nota, boolean aprovado, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.frequencia = frequencia;
		this.nota = nota;
		this.aprovado = aprovado;
		this.endereco = endereco;
	}
	
	
	@Override
	public String toString() {
		
		return getNome() + " " + endereco;
	}


	public boolean status(){
		return nota>7?true:false;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getFrequencia() {
		return frequencia;
	}


	public void setFrequencia(int frequencia) {
		this.frequencia = frequencia;
	}


	public float getNota() {
		return nota;
	}


	public void setNota(float nota) {
		this.nota = nota;
	}


	public boolean isAprovado() {
		return aprovado;
	}


	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	


}
