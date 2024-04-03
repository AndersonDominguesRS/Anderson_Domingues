package escolaApp.model.domain;

public class Aluno {

	public Integer id;
	public String nome;
	public boolean aprovado;
	public float mediaAvaliacao;
	
	public Aluno() {
		this.nome="Joao";
		this.aprovado=true;
		this.mediaAvaliacao=78;
	}
	
	public Aluno(String nome) {
		this.nome=nome;
	}
	
	@Override
	public String toString() {
		
		return " Nome do aluno: " + nome + " ------ " +  " Id do aluno: "+id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}

	public float getMediaAvaliacao() {
		return mediaAvaliacao;
	}

	public void setMediaAvaliacao(float mediaAvaliacao) {
		this.mediaAvaliacao = mediaAvaliacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public boolean statusAprovacao() {
		return mediaAvaliacao > 70? aprovado=true : false ;
	}	
	
}
