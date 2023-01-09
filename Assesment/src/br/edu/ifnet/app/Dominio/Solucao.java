package br.edu.ifnet.app.Dominio;

import java.util.Scanner;

import br.edu.ifnet.app.Auxiliar.Constante;

public class Solucao extends Ocorrencia {
	
	private String peca=null;
	private String descricaoSolucao=null;
	private int tipoAtendimento=0;
	

	
	@Override
	public void regOcorrencia() {
		
		Scanner ne = new Scanner(System.in);
		
		System.out.println("Informe o tipo de atendimento:");
		System.out.println("( 1 ) = Manuten��o preventiva.");
		System.out.println("( 2 ) = Manuten��o corretiva.");
		
		tipoAtendimento=ne.nextInt();
		
		if (tipoAtendimento==1) {
			
			Scanner in = new Scanner(System.in);
			
			System.out.println("Informe a identifica��o do cliente:");			
			clienteTeste=in.nextLine();
			System.out.println("Informe a data");
			data=in.nextLine();
			System.out.println("Digite as observa��es:");
			observacoes=in.nextLine();
			System.out.println("Informe a hora de inicio do atendimento:");
			horaInicioAtendimento=in.nextInt();
			System.out.println("Informe a hora final do atendimento.");
			horaFimAtendimento=in.nextInt();

			tipoAtendimentoRealizado=Constante.preventivo;
			
			regHorarioAtendimento(horaInicioAtendimento, horaFimAtendimento);
			
			imprimir();
			System.out.println("Observa��es: " + observacoes);	
			System.out.println("---------------------------------------------------------");
			
//			in.close();
			
			
		}else if (tipoAtendimento==2){
			
			Scanner in = new Scanner(System.in);
			
			System.out.println("Informe a identifica��o do cliente:");			
			clienteTeste=in.nextLine();		
			System.out.println("Informe a data");
			data=in.nextLine();
			System.out.println("Informe a hora de abertura da solicita��o:");
			horaAbertura=in.nextInt();
			System.out.println("Informe a hora de recebimento:");
			horaRecebimento=in.nextInt();			
			System.out.println("Informe a hora de inicio do atendimento:");
			horaInicioAtendimento=in.nextInt();
			System.out.println("Informe a hora final do atendimento.");
			horaFimAtendimento=in.nextInt();
			System.out.println("Selecione um tipo de equipamento:");		
			opcoesEquipamentos();		
			System.out.println("Informe a identifica��o do equipamento:");
			identificacaoEquipamento=in.nextLine();	
			System.out.println("Informe a pe�a danificada:");
			peca=in.nextLine();
			System.out.println("Informe a descricao da solucao:");
			descricaoSolucao=in.nextLine();
			tipoAtendimentoRealizado=Constante.corretivo;
			
			regHorarioAtendimento( horaAbertura,  horaRecebimento, horaInicioAtendimento, horaFimAtendimento);
			
			imprimir();
			System.out.println("Observa��es: " + descricaoSolucao);	
			System.out.println("---------------------------------------------------------");
			
//			in.close();			
			
			
		} else {
			System.out.println("Op��o inv�lida!");
		}
		
		
	}
	@Override
	public void opcoesEquipamentos() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void imprimir() {
		
		System.out.println("Resumo do registro:");
		System.out.println(clienteTeste);
		System.out.println(tipoAtendimentoRealizado);
		System.out.println("Hora de in�cio do atendimento: " + horaInicioAtendimento);
		System.out.println("Hora final do atendimento: " + horaFimAtendimento);
		System.out.println("Tempo total de atendimento: " +tempoTotalAtendimento);		
		
		
	}
	
	public void regHorarioAtendimento(int horaInicio, int horaFim) {
		
		tempoTotalAtendimento=horaFim-horaInicio;			
		
	}
	
	
	public void regHorarioAtendimento(int horaAbertura, int horaRecebimento, int horaInicio, int horaFim) {
		
		tempoTotalAtendimento=horaFim-horaInicio;
		tempoRespostaAtendimento=horaRecebimento-horaAbertura;
		tempoRespostaInicioAtendimento=horaInicio-horaAbertura;		
		
	}		
		

}
