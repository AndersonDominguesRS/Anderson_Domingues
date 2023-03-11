package br.edu.infinet.assesment.model.domain;

import br.edu.infinet.assesment.model.exceptions.RegistraOcorrenciaExceptions;

abstract class Ocorrencia {
	
	protected Integer id;
	protected String data=null;
	protected String identificacaoCliente=null;
	protected String observacoes=null;	
	protected boolean statusChamado=false;
	protected String tipoEquipamento=null;	
	protected String identificacaoEquipamento=null;	
	protected String tipoAtendimentoRealizado=null;
	protected float horaAbertura=0;
	protected int opcao=0;
	protected int horaRecebimento=0;
	protected int horaInicioAtendimento=0;
	protected int horaFimAtendimento=0;
	protected int tempoTotalAtendimento=0;
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





	public void setTempoTotalAtendimento(int tempoTotalAtendimento) {
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

	public int getHoraRecebimento() {
		return horaRecebimento;
	}

	public void setHoraRecebimento(int horaRecebimento) {
		this.horaRecebimento = horaRecebimento;
	}

	public int getHoraInicioAtendimento() {
		return horaInicioAtendimento;
	}

	public void setHoraInicioAtendimento(int horaInicioAtendimento) {
		this.horaInicioAtendimento = horaInicioAtendimento;
	}

	public int getHoraFimAtendimento() {
		return horaFimAtendimento;
	}

	public void setHoraFimAtendimento(int horaFimAtendimento) {
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

	public int getTempoTotalAtendimento() {
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
	public abstract String opcoesEquipamentos() throws RegistraOcorrenciaExceptions;
	

}
