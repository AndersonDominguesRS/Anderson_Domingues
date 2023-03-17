package br.edu.infinet.assesment.model.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.edu.infinet.assesment.model.exceptions.RegistraOcorrenciaExceptions;

abstract class Ocorrencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Integer id;
	protected String data=null;
	protected String hora=null;
	protected String identificacaoCliente=null;
	protected String observacoes=null;	
	protected boolean statusChamado=false;
	protected String tipoEquipamento=null;	
	protected String identificacaoEquipamento=null;	
	protected String tipoAtendimentoRealizado=null;
	protected float horaAbertura=0;
	protected int opcao=0;
	protected String horaRecebimento=null;
	protected String horaInicioAtendimento=null;
	protected String horaFimAtendimento=null;
	protected String tempoTotalAtendimento=null;
	protected int tempoRespostaAtendimento=0;
	protected int tempoRespostaInicioAtendimento=0;
	protected String statusSla=null;
	
	public Ocorrencia() {
		
	}
	
	
	
	
	
	public String getData() {
		return data;
	}





	public void setData(String data) {
		this.data = data;
	}





	public int getOpcao() {
		return opcao;
	}





	public void setOpcao(int opcao) {
		this.opcao = opcao;
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





	public void setTipoAtendimentoRealizado(String tipoAtendimentoRealizado) {
		this.tipoAtendimentoRealizado = tipoAtendimentoRealizado;
	}





	public void setHoraAbertura(int horaAbertura) {
		this.horaAbertura = horaAbertura;
	}





	public void setTempoTotalAtendimento(String tempoTotalAtendimento) {
		this.tempoTotalAtendimento = tempoTotalAtendimento;
	}





	public void setTempoRespostaAtendimento(int tempoRespostaAtendimento) {
		this.tempoRespostaAtendimento = tempoRespostaAtendimento;
	}





	public void setTempoRespostaInicioAtendimento(int tempoRespostaInicioAtendimento) {
		this.tempoRespostaInicioAtendimento = tempoRespostaInicioAtendimento;
	}





	public void setStatusSla(String statusSla) {
		this.statusSla = statusSla;
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

	public String getHoraRecebimento() {
		return horaRecebimento;
	}

	public void setHoraRecebimento(String horaRecebimento) {
		this.horaRecebimento = horaRecebimento;
	}

	public String getHoraInicioAtendimento() {
		return horaInicioAtendimento;
	}

	public void setHoraInicioAtendimento(String horaInicioAtendimento) {
		this.horaInicioAtendimento = horaInicioAtendimento;
	}

	public String getHoraFimAtendimento() {
		return horaFimAtendimento;
	}

	public void setHoraFimAtendimento(String horaFimAtendimento) {
		this.horaFimAtendimento = horaFimAtendimento;
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

	public String getTipoAtendimentoRealizado() {
		return tipoAtendimentoRealizado;
	}

	public float getHoraAbertura() {
		return horaAbertura;
	}

	public String getTempoTotalAtendimento() {
		return tempoTotalAtendimento;
	}

	public int getTempoRespostaAtendimento() {
		return tempoRespostaAtendimento;
	}

	public int getTempoRespostaInicioAtendimento() {
		return tempoRespostaInicioAtendimento;
	}

	public String getStatusSla() {
		return statusSla;
	}

	
	public Ocorrencia (String identificacaoCliente, String observacoes) {
		
		this.identificacaoCliente=identificacaoCliente;
		this.observacoes=observacoes;
		
	}
	
	public abstract String regOcorrencia( String identificacaoEquipamento) throws RegistraOcorrenciaExceptions;	
//	public abstract String opcoesEquipamentos() throws RegistraOcorrenciaExceptions;
	

}
