package br.edu.ifnet.app.Dominio;

import java.util.Scanner;

import br.edu.ifnet.app.Auxiliar.Constante;
import br.edu.ifnet.app.Exceptions.HorariosInicioFimAtendimentoExceptions;
import br.edu.ifnet.app.Exceptions.HorariosRecebimentoExceptions2;
import br.edu.ifnet.app.Exceptions.RegistraOcorrenciaExceptions;

public class Solucao extends Ocorrencia {
	
	private String peca=null;
	private String descricaoSolucao=null;
	private int tipoAtendimento=0;
	
	public Solucao( String pecaInformada, int horaInicioAtendimento, int horaFinalAtendimento, int horaAbertura, int
			horaRecebimento){
		
		this.peca=pecaInformada;
		this.horaInicioAtendimento=horaInicioAtendimento;
		this.horaFimAtendimento=horaFinalAtendimento;
		this.horaAbertura=horaAbertura;
		this.horaRecebimento=horaRecebimento;
		
	};
	
	@Override
	public void regOcorrencia (String nomeCliente, String identificacaoEquipamento, String descricao, String data) throws RegistraOcorrenciaExceptions {
		
		this.identificacaoCliente=nomeCliente;
		this.identificacaoEquipamento=identificacaoEquipamento;
		this.descricaoSolucao=descricao;
		this.data=data;		
		
		if (nomeCliente==null || identificacaoEquipamento==null || descricao==null || data==null) {
			
			throw new RegistraOcorrenciaExceptions("Os campos nome do cliente, identificação do equipamento, descriÃ§Ã£o do defeito e data devem ser preenhidos");
		}
		
		Scanner ne = new Scanner(System.in);
		
		System.out.println("Informe o tipo de atendimento:");
		System.out.println("( 1 ) = Manutenção preventiva.");
		System.out.println("( 2 ) = Manutenção corretiva.");
		
		tipoAtendimento=ne.nextInt();
		
		if (tipoAtendimento==1) {
			
			tipoAtendimentoRealizado=Constante.preventivo;	
			
			try {
				regHorarioAtendimento(horaInicioAtendimento, horaFimAtendimento);
			} catch (HorariosInicioFimAtendimentoExceptions e) {
				System.out.println("[ERROR] " + e.getMessage());
			}
				
			
		}else if (tipoAtendimento==2){
			
			try {
				regHorarioAtendimento( horaAbertura,  horaRecebimento, horaInicioAtendimento, horaFimAtendimento);
								
			} catch (HorariosInicioFimAtendimentoExceptions | HorariosRecebimentoExceptions2 e) {
				System.out.println("[ERROR] " + e.getMessage());
			}			
						
			
			
		} else {
			System.out.println("Opção de atendimento inválida!");
		}
		
		
	}
	
	
	@Override
	public void opcoesEquipamentos() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("(1) - " + Constante.te);
		System.out.println("(2) - " + Constante.ts);
		System.out.println("(3) - " + Constante.ca);
		System.out.println("(4) - " + Constante.pf);
		
		opcao=in.nextInt();
		
		if (opcao==1) {
			tipoEquipamento=Constante.te;
		}
		else if (opcao==2) {
			tipoEquipamento=Constante.ts;
			
		}
		else if (opcao==3) {
			tipoEquipamento=Constante.ca;
			
		}
		else if (opcao==4) {
			tipoEquipamento=Constante.pf;
			
		}
		else  {
			System.out.println("Opcao invalida!");
			
		}
		
		in.close();
		
		
	}
	
	public void regHorarioAtendimento(int horaInicio, int horaFim) throws HorariosInicioFimAtendimentoExceptions {
		
		if (horaInicio>horaFim) {
			
			throw new HorariosInicioFimAtendimentoExceptions("Horários inicio e fim inválidos");
		}
		
		tempoTotalAtendimento=horaFim-horaInicio;
		imprimirPreventivo();
		
	}	
	
	public void regHorarioAtendimento(int horaAbertura, int horaRecebimento, int horaInicio, int horaFim)
			throws HorariosInicioFimAtendimentoExceptions, HorariosRecebimentoExceptions2 {
		
		if (horaInicio>horaFim) {
			
			throw new HorariosInicioFimAtendimentoExceptions("Hotários inicio e fim inválidos");
		}
		
	
		if (horaAbertura>horaInicio || horaAbertura>horaRecebimento || horaAbertura>horaInicioAtendimento || horaRecebimento>horaInicioAtendimento) {
			
			throw new HorariosRecebimentoExceptions2("Horários inválidos de recebimento e inicio de atendimento inválidos");
		}
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Selecione um tipo de equipamento:");		
		opcoesEquipamentos();		
		tipoAtendimentoRealizado=Constante.corretivo;
					
		in.close();
		
		tempoTotalAtendimento=horaFim-horaInicio;
		tempoRespostaAtendimento=horaRecebimento-horaAbertura;
		tempoRespostaInicioAtendimento=horaInicio-horaAbertura;	
		
		imprimirCorretivo();
		
	}
	
	public void imprimirPreventivo() {
		
		System.out.println("Resumo do registro:");
		System.out.println("Identificação do cliente: " + identificacaoCliente);
		System.out.println("Tipo de atendimento realizado: " + tipoAtendimentoRealizado);
		System.out.println("Hora de inicio do atendimento: " + horaInicioAtendimento);
		System.out.println("Hora final do atendimento: " + horaFimAtendimento);
		System.out.println("Tempo total de atendimento: " +tempoTotalAtendimento);		
		
		
	}
	
	public void imprimirCorretivo() {
		
		System.out.println("Resumo do registro:");
		System.out.println("Identificação do cliente: " + identificacaoCliente);
		System.out.println("Tipo de atendimento realizado: " + tipoAtendimentoRealizado);
		System.out.println("Tipo de equipamento avaliado: " + tipoEquipamento);
		System.out.println("Identificação do equipamento: " + identificacaoEquipamento);
		System.out.println("Hora abertura do chamado: " + horaAbertura);
		System.out.println("Hora recebimento do chamado: " + horaRecebimento);		
		System.out.println("Hora de inicio do atendimento: " + horaInicioAtendimento);
		System.out.println("Hora final do atendimento: " + horaFimAtendimento);
		System.out.println("Tempo total de atendimento: " +tempoTotalAtendimento);	
		System.out.println("Tempo de resposta de recebimento do chamado: " +tempoRespostaAtendimento);
		System.out.println("Tempo total percorrido até o inicio do atendimento: " +tempoRespostaInicioAtendimento);		
		
	}
		

}
