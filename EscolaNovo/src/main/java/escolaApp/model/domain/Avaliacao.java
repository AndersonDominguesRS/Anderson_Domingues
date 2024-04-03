package escolaApp.model.domain;

import java.util.List;

public class Avaliacao {
	
	private Integer id;
	private int idAvaliacao;
	private Disciplina disciplina;
	private Aluno aluno;
	private float notaLancada;
	private String mesAno;
	
	@Override
	public String toString() {

		return "ID da avaliacao " + idAvaliacao;
	}
	
	public int mediaNotas(List<String> notas) {
		
		float notaLancada=0;
		int cont=0;
		
		for (String  nota : notas) {
			
			notaLancada=notaLancada+ Float.valueOf(nota);
			cont++;
		}
		return (int) (notaLancada/cont);	
		
		
	}

	
	public int getIdAvaliacao() {
		return idAvaliacao;
	}
	public void setIdAvaliacao(int idAvaliacao) {
		this.idAvaliacao = idAvaliacao;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public float getNotaLancada() {
		return notaLancada;
	}
	public void setNotaLancada(float notaLancada) {
		this.notaLancada = notaLancada;
	}
	public String getMesAno() {
		return mesAno;
	}
	public void setMesAno(String mesAno) {
		this.mesAno = mesAno;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}
	
		

}
