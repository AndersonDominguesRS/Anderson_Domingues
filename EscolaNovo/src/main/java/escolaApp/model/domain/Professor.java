package escolaApp.model.domain;

public class Professor {
	
	private int id;
	private String nomeProfessor;
	private Disciplina disciplina;
	
	@Override
	public String toString() {

		return "Nome do professor " + nomeProfessor;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nomeProfessor;
	}
	public void setNome(String nome) {
		this.nomeProfessor = nome;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	

}
