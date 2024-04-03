package escolaApp.model.domain;

public class ListaEspera extends Turma {
	
	private Integer idLista;
	private Disciplina disciplina;
	private String dataInclusao;
	private boolean status;
	
	@Override
	public String toString() {

		return "ID lista de espera " + idLista + " " + super.toString();
	}	
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public String getDataInclusao() {
		return dataInclusao;
	}
	public void setDataInclusao(String dataInclusao) {
		this.dataInclusao = dataInclusao;
	}
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Integer getIdLista() {
		return idLista;
	}

	public void setIdLista(Integer idLista) {
		this.idLista = idLista;
	}
	
	

}
