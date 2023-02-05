package br.edu.infinet.assesment.model.domain;

import br.edu.infinet.assesment.model.exceptions.RegistraOcorrenciaExceptions;

abstract class Ocorrencia {
	
	protected String data=null;
	protected String identificacaoCliente=null;
	protected String observacoes=null;	
	protected boolean statusChamado=false;
	protected String tipoEquipamento=null;	
	protected String identificacaoEquipamento=null;	
	protected String tipoAtendimentoRealizado=null;
	protected int horaAbertura=0;
	protected int opcao=0;
	protected int horaRecebimento=0;
	protected int horaInicioAtendimento=0;
	protected int horaFimAtendimento=0;
	protected int tempoTotalAtendimento=0;
	protected int tempoRespostaAtendimento=0;
	protected int tempoRespostaInicioAtendimento=0;
	protected String statusSla=null;
	
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

	public int getHoraAbertura() {
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
