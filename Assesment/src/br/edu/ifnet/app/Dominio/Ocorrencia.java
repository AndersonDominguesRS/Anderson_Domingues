package br.edu.ifnet.app.Dominio;

abstract class Ocorrencia {
	
	protected String clienteTeste=null;
	protected String tipoEquipamento=null;
	protected String identificacaoEquipamento=null;
	protected String data=null;
	protected String observacoes=" ";
	protected String tipoAtendimentoRealizado=null;
	protected int opcao=0;
	protected String nomeTecnico=null;	
	protected int horaAbertura=0;
	protected int horaRecebimento=0;
	protected int horaInicioAtendimento=0;
	protected int horaFimAtendimento=0;
	protected int tempoTotalAtendimento=0;
	protected int tempoRespostaAtendimento=0;
	protected int tempoRespostaInicioAtendimento=0;
	protected String statusSla=null;
	
	public abstract void regOcorrencia();	
	public abstract void opcoesEquipamentos();
	public abstract void imprimir();

}
