package br.edu.infinet.assesment.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.edu.infinet.assesment.model.exceptions.RegistraOcorrenciaExceptions;

@Entity
@Table(name = "TOcorrencia")
@Inheritance(strategy = InheritanceType.JOINED)
abstract class Ocorrencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Integer id;
	protected String data;
	protected String identificacaoCliente;
	protected String observacoes;
	protected String tipoEquipamento;
	protected String identificacaoEquipamento;
	protected boolean statusChamado = false;

	@ManyToMany(mappedBy = "ocorrencias")
	private List<Tecnico> tecnicos;

	@ManyToOne
	@JoinColumn(name = "idCliente")
	private Cliente cliente;

	public Ocorrencia() {

	}

	public List<Tecnico> getTecnicos() {
		return tecnicos;
	}

	public void setTecnicos(List<Tecnico> tecnicos) {
		this.tecnicos = tecnicos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setIdentificacaoCliente(String identificacaoCliente) {
		this.identificacaoCliente = identificacaoCliente;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public void setTipoEquipamento(String tipoEquipamento) {
		this.tipoEquipamento = tipoEquipamento;
	}

	public void setIdentificacaoEquipamento(String identificacaoEquipamento) {
		this.identificacaoEquipamento = identificacaoEquipamento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isStatusChamado() {
		return statusChamado;
	}

	public void setStatusChamado(boolean statusChamado) {
		this.statusChamado = statusChamado;
	}

	public String getIdentificacaoCliente() {
		return identificacaoCliente;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public String getTipoEquipamento() {
		return tipoEquipamento;
	}

	public String getIdentificacaoEquipamento() {
		return identificacaoEquipamento;
	}

	public Ocorrencia(String identificacaoCliente, String observacoes) {

		this.identificacaoCliente = identificacaoCliente;
		this.observacoes = observacoes;

	}

	public abstract String regOcorrencia(String identificacaoEquipamento) throws RegistraOcorrenciaExceptions;
//	public abstract String opcoesEquipamentos() throws RegistraOcorrenciaExceptions;

}
