package br.edu.ifnet.app.Dominio;

import br.edu.ifnet.app.Exceptions.RegistraOcorrenciaExceptions;

abstract class Ocorrencia {
	
	protected String tipoEquipamento=null;
	protected String identificacaoCliente=null;
	protected String identificacaoEquipamento=null;
	protected String data=null;
	protected String tipoAtendimentoRealizado=null;
	protected int opcao=0;
	protected int horaAbertura=0;
	protected int horaRecebimento=0;
	protected int horaInicioAtendimento=0;
	protected int horaFimAtendimento=0;
	protected int tempoTotalAtendimento=0;
	protected int tempoRespostaAtendimento=0;
	protected int tempoRespostaInicioAtendimento=0;
	protected String statusSla=null;
	
	public abstract void regOcorrencia(String nomeCliente, String identificacaoEquipamento, String descricao, String data) throws RegistraOcorrenciaExceptions;	
	public abstract void opcoesEquipamentos();
	

}
