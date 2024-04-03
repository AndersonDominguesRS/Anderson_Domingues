package escolaApp.model.domain;

public class Disciplina {
	
	private Integer id;
	private String nomeDisciplina;
	private Aluno aluno;
	private float avaliacaoAluno;
	
	
	@Override
	public String toString() {

		return "Nome da disciplina " + nomeDisciplina + " ID da disciplina " + id ;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nomeDisciplina;
	}
	public void setNome(String nome) {
		this.nomeDisciplina = nome;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public float getAvaliacaoAluno() {
		return avaliacaoAluno;
	}

	public void setAvaliacaoAluno(float avaliacaoAluno) {
		this.avaliacaoAluno = avaliacaoAluno;
	}
	
	
	
	

}
