package escolaApp.model.domain;

public class Turma {
	
	private Integer id;
	private Aluno aluno;
	private Professor professor;
	
	@Override
	public String toString() {

		return "ID da turma " +id;
	}	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public String statusFila(int totalAlunos) {
		
		if (totalAlunos>=20)
			return "Lista Cheia";
		else
			return "Lista Vazia";
	}	
	

}
